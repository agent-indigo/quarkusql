package com.keyin.hynes.braden.quarkusql.repositories;
import java.util.UUID;
import com.keyin.hynes.braden.quarkusql.entities.Realtor;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
public final class RealtorRepository implements PanacheRepositoryBase<Realtor, UUID> {}