package com.keyin.hynes.braden.quarkusql.entities;
import com.keyin.hynes.braden.quarkusql.abstracts.EntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "realtors")
@ToString(callSuper = true)
public final class Realtor extends EntityBase {
  private String first_name;
  private String last_name;
  private String photo;
  private String description;
  private String email_address;
  private String phone_number;
  private Boolean is_mvp;
}