package com.keyin.hynes.braden.quarkusql.repositories;
import com.keyin.hynes.braden.quarkusql.entities.Realtor;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public final class RealtorRepository implements PanacheRepository<Realtor> {}