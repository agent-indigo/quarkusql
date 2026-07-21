package com.keyin.hynes.braden.quarkusql.entities;
import com.keyin.hynes.braden.quarkusql.abstracts.EntityBase;
import jakarta.annotation.Nonnull;
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
  private String interior_photo_1;
  private String interior_photo_2;
  private String interior_photo_3;
  private String interior_photo_4;
  private String interior_photo_5;
  private String interior_photo_6;
  @Nonnull
  private Boolean is_published;
  @ManyToOne
  @Nonnull
  private Realtor realtor;
}