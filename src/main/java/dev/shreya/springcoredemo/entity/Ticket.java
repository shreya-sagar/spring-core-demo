package dev.shreya.springcoredemo.entity;

import dev.shreya.springcoredemo.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Ticket {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ticket_id")
  private Long id;
  private String title;
  @Column(length = 2000)
  private String description;

  @ManyToOne
  @JoinColumn(name = "application_id")
  private Application application;

  @ManyToOne
  @JoinTable(name = "ticket_release", joinColumns = @JoinColumn(name = "ticket_fk"), inverseJoinColumns = @JoinColumn(name = "release_fk"))
  private Release release;

  private String status;

  public Ticket(String title, String description, Application application, Release release,
      String status) {
    this.title = title;
    this.description = description;
    this.application = application;
    this.release = release;
    this.status = status;
  }
}
