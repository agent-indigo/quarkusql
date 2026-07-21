package com.keyin.hynes.braden.quarkusql.controllers;
import java.util.UUID;
import com.keyin.hynes.braden.quarkusql.entities.Realtor;
import com.keyin.hynes.braden.quarkusql.repositories.RealtorRepository;
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
@Path("/realtors")
public final class RealtorRestController {
  @Inject
  private final RealtorRepository realtorRepository = new RealtorRepository();
  private Realtor target;
  @GET
  public Response getAll() {
    return Response.ok(realtorRepository.findAll().list()).build();
  }
  @GET
  @Path("/{id}")
  public Response getOne(@PathParam("id") final UUID id) {
    return Response.ok(realtorRepository.findById(id)).build();
  }
  @POST
  public Response add(
    Realtor realtor,
    @Context UriInfo uriInfo
  ) {
    realtorRepository.persist(realtor);
    return Response.created(uriInfo.getAbsolutePathBuilder().path(realtor.getId().toString()).build(realtor)).build();
  }
  @PATCH
  @Path("/{id}")
  @Transactional
  public Response edit(
    @PathParam("id") final UUID id,
    final Realtor changes
  ) {
    target = realtorRepository.findById(id);
    if (changes.getFirst_name() != null) target.setFirst_name(changes.getFirst_name());
    if (changes.getLast_name() != null) target.setLast_name(changes.getLast_name());
    if (changes.getDescription() != null) target.setDescription(changes.getDescription());
    if (changes.getPhoto() != null) target.setPhoto(changes.getPhoto());
    if (changes.getEmail_address() != null) target.setEmail_address(changes.getEmail_address());
    if (changes.getPhone_number() != null) target.setPhone_number(changes.getPhone_number());
    if (changes.getIs_mvp() != null) target.setIs_mvp(changes.getIs_mvp());
    return Response.ok(target).build();
  }
  @DELETE
  @Path("/{id}")
  public Response delete(@PathParam("id") final UUID id) {
    return realtorRepository.deleteById(id) ? Response.noContent().build() : Response.serverError().build();
  }
}