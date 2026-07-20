package com.keyin.hynes.braden.quarkusql.abstracts;
import java.time.Instant;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
@Data
@MappedSuperclass
public abstract class EntityBase {
  @Id
  private final UUID id = UUID.randomUUID();
  @CreationTimestamp
  private final Instant created_at = Instant.now();
  @UpdateTimestamp
  private Instant updated_at = Instant.now();
}