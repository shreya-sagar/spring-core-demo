package dev.shreya.springcoredemo.enums;

public enum Status {
  NEW("NEW"),
  IN_PROGRESS("IN_PROGRESS"),
  COMPLETED("COMPLETED");

  private final String status;

  Status(String value) {
    this.status = value;
  }

  public String getStatus() {
    return status;
  }
}
