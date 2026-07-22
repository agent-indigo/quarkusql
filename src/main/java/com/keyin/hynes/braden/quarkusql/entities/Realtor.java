package com.keyin.hynes.braden.quarkusql.entities;
import com.keyin.hynes.braden.quarkusql.abstracts.EntityBase;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "realtors")
@ToString(callSuper = true)
public final class Realtor extends EntityBase {
  @Nonnull
  private String first_name;
  @Nonnull
  private String last_name;
  @Nonnull
  private String photo;
  @Nonnull
  private String description;
  @Nonnull
  private String email_address;
  @Nonnull
  private String phone_number;
  @Nonnull
  private Boolean is_mvp = false;
}