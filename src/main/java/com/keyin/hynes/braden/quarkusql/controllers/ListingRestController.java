package com.keyin.hynes.braden.quarkusql.controllers;
import java.util.List;
import com.keyin.hynes.braden.quarkusql.entities.Listing;
import com.keyin.hynes.braden.quarkusql.repositories.ListingRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
@Path("/listings")
public final class ListingRestController {
  @Inject
  private final ListingRepository listingRestRepository = new ListingRepository();
  @GET
  @Path("/")
  public List<Listing> getAll() {
    return listingRestRepository.findAll().list();
  }
}