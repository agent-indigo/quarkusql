package com.keyin.hynes.braden.quarkusql.entities;
import com.keyin.hynes.braden.quarkusql.abstracts.EntityBase;
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
  private String title;
  private String address;
  private String city;
  private String state;
  private String zipcode;
  private String description;
  private Float price;
  private Integer bedrooms;
  private Float bathrooms;
  private Integer garage;
  private Float sqft;
  private Float lot_size;
  private String exterior_photo;
  private String interior_photo_1;
  private String interior_photo_2;
  private String interior_photo_3;
  private String interior_photo_4;
  private String interior_photo_5;
  private String interior_photo_6;
  private Boolean is_published;
  @ManyToOne
  private Realtor realtor;
}