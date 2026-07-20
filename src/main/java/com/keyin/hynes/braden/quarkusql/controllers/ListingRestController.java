package com.keyin.hynes.braden.quarkusql.controllers;
import com.keyin.hynes.braden.quarkusql.repositories.ListingRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
@Path("/listings")
public final class ListingRestController {
  @Inject
  private final ListingRepository listingRestRepository = new ListingRepository();
  @GET
  public Response getAll() {
    return Response.ok(listingRestRepository.findAll().list()).build();
  }
}