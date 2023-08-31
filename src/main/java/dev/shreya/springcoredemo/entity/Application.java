package dev.shreya.springcoredemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Data
@NoArgsConstructor
public class Application {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "application_id")
  @Setter
  private Long id;
  @Column(name = "application_name", nullable = false)
  private String name;
  @Column(length = 2000)
  private String description;
  private String owner;

  public Application(String name, String description, String owner) {
    this.name = name;
    this.description = description;
    this.owner = owner;
  }
}
