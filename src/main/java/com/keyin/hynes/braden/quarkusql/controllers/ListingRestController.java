package com.keyin.hynes.braden.quarkusql.controllers;
import java.util.UUID;
import com.keyin.hynes.braden.quarkusql.entities.Listing;
import com.keyin.hynes.braden.quarkusql.repositories.ListingRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
@Path("/listings")
public final class ListingRestController {
  @Inject
  private final ListingRepository listingRepository = new ListingRepository();
  private Listing target;
  @GET
  public Response getAll() {
    return Response.ok(listingRepository.findAll().list()).build();
  }
  @GET
  @Path("/{id}")
  public Response getOne(@PathParam("id") final UUID id) {
    return Response.ok(listingRepository.findById(id)).build();
  }
  @POST
  public Response add(
    Listing listing,
    @Context UriInfo uriInfo
  ) {
    listingRepository.persist(listing);
    return Response.created(uriInfo.getAbsolutePathBuilder().path(listing.getId().toString()).build(listing)).build();
  }
  @PATCH
  @Path("/{id}")
  @Transactional
  public Response edit (
    @PathParam("id") final UUID id,
    final Listing changes
  ) {
    target = listingRepository.findById(id);
    if (changes.getTitle() != null) target.setTitle(changes.getTitle());
    if (changes.getAddress() != null) target.setAddress(changes.getAddress());
    if (changes.getCity() != null) target.setCity(changes.getCity());
    if (changes.getState() != null) target.setState(changes.getState());
    if (changes.getZipcode() != null) target.setZipcode(changes.getZipcode());
    if (changes.getDescription() != null) target.setDescription(changes.getDescription());
    if (changes.getPrice() != null) target.setPrice(changes.getPrice());
    if (changes.getBedrooms() != null) target.setBedrooms(changes.getBedrooms());
    if (changes.getBathrooms() != null) target.setBathrooms(changes.getBathrooms());
    if (changes.getGarage() != null) target.setGarage(changes.getGarage());
    if (changes.getSqft() != null) target.setSqft(changes.getSqft());
    if (changes.getLot_size() != null) target.setLot_size(changes.getLot_size());
    if (changes.getExterior_photo() != null) target.setExterior_photo(changes.getExterior_photo());
    if (changes.getInterior_photo_1() != null) target.setInterior_photo_1(changes.getInterior_photo_1());
    if (changes.getInterior_photo_2() != null) target.setInterior_photo_2(changes.getInterior_photo_2());
    if (changes.getInterior_photo_3() != null) target.setInterior_photo_3(changes.getInterior_photo_3());
    if (changes.getInterior_photo_4() != null) target.setInterior_photo_4(changes.getInterior_photo_4());
    if (changes.getInterior_photo_5() != null) target.setInterior_photo_5(changes.getInterior_photo_5());
    if (changes.getInterior_photo_6() != null) target.setInterior_photo_6(changes.getInterior_photo_6());
    if (changes.getIs_published() != null) target.setIs_published(changes.getIs_published());
    if (changes.getRealtor() != null) target.setRealtor(changes.getRealtor());
    return Response.ok(target).build();
  }
  @DELETE
  @Path("/{id}")
  public Response delete(@PathParam("id") final UUID id) {
    return listingRepository.deleteById(id) ? Response.noContent().build() : Response.serverError().build();
  }
}