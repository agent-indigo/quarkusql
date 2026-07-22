package com.keyin.hynes.braden.quarkusql.entities;
import com.keyin.hynes.braden.quarkusql.abstracts.EntityBase;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "listings")
@ToString(callSuper = true)
public final class Listing extends EntityBase {
  @Nonnull
  private String title;
  @Nonnull
  private String address;
  @Nonnull
  private String city;
  @Nonnull
  private String state;
  @Nonnull
  private String zipcode;
  @Nonnull
  private String description;
  @Nonnull
  private Float price;
  @Nonnull
  private Integer bedrooms;
  @Nonnull
  private Float bathrooms;
  @Nonnull
  private Integer garage;
  @Nonnull
  private Float sqft;
  @Nonnull
  private Float lot_size;
  @Nonnull
  private String exterior_photo;
  @Nonnull
  private String interior_photo_1;
  @Nonnull
  private String interior_photo_2;
  @Nonnull
  private String interior_photo_3;
  @Nonnull
  private String interior_photo_4;
  @Nullable
  private String interior_photo_5;
  @Nullable
  private String interior_photo_6;
  @Nonnull
  private Boolean is_published = true;
  @ManyToOne
  @Nullable
  private Realtor realtor;
}