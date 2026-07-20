package com.keyin.hynes.braden.quarkusql.controllers;
import com.keyin.hynes.braden.quarkusql.repositories.RealtorRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
@Path("/realtors")
public final class RealtorRestController {
  @Inject
  private final RealtorRepository realtorRepository = new RealtorRepository();
  @GET
  @Path("/")
  public Response getAll() {
    return Response.ok(realtorRepository.findAll().list()).build();
  }
}