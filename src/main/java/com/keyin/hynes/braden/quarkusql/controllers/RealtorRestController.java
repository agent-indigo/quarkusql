package com.keyin.hynes.braden.quarkusql.controllers;
import java.util.List;
import java.util.UUID;
import com.keyin.hynes.braden.quarkusql.entities.Realtor;
import com.keyin.hynes.braden.quarkusql.interfaces.RestCrud;
import com.keyin.hynes.braden.quarkusql.repositories.RealtorRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("/realtors")
@Produces(MediaType.APPLICATION_JSON)
public final class RealtorRestController implements RestCrud<Realtor, UUID> {
  @Inject
  private final RealtorRepository realtorRepository = new RealtorRepository();
  private Realtor target;
  @GET
  public List<Realtor> getAll() {
    return realtorRepository.findAll().list();
  }
  @GET
  @Path("/{id}")
  public Realtor getOne(@PathParam("id") final UUID id) {
    return realtorRepository.findById(id);
  }
  @POST
  public Realtor add(Realtor post) {
    realtorRepository.persist(post);
    return post;
  }
  @PATCH
  @Path("/{id}")
  @Transactional
  public Realtor edit(
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
    return target;
  }
  @DELETE
  @Path("/{id}")
  public Boolean delete(@PathParam("id") final UUID id) {
    return realtorRepository.deleteById(id);
  }
}