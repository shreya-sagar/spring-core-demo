package dev.shreya.springcoredemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Release {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "release_id")
  private Long id;
  private String releaseDate;
  @Column(length = 2000)
  private String description;

  public Release(String releaseDate, String description) {
    this.releaseDate = releaseDate;
    this.description = description;
  }
}
