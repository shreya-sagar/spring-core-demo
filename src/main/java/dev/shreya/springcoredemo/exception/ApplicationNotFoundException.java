package dev.shreya.springcoredemo.exception;

public class ApplicationNotFoundException extends RuntimeException {

  public ApplicationNotFoundException(String message) {
    super(message);
  }
}
