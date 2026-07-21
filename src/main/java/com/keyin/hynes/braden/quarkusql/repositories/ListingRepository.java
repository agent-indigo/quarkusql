package com.keyin.hynes.braden.quarkusql.repositories;
import java.util.UUID;
import com.keyin.hynes.braden.quarkusql.entities.Listing;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public final class ListingRepository implements PanacheRepositoryBase<Listing, UUID> {}