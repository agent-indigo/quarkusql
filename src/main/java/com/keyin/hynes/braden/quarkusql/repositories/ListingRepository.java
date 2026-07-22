package com.keyin.hynes.braden.quarkusql.repositories;
import java.util.UUID;
import com.keyin.hynes.braden.quarkusql.entities.Listing;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
public class ListingRepository implements PanacheRepositoryBase<Listing, UUID> {}