package com.keyin.hynes.braden.quarkusql.controllers;
import java.util.List;
import com.keyin.hynes.braden.quarkusql.entities.Realtor;
import com.keyin.hynes.braden.quarkusql.repositories.RealtorRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
@Path("/realtors")
public final class RealtorRestController {
  @Inject
  private final RealtorRepository realtorRepository = new RealtorRepository();
  @GET
  @Path("/")
  public List<Realtor> getAll() {
    return realtorRepository.findAll().list();
  }
}