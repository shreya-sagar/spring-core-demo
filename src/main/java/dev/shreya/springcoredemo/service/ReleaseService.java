package dev.shreya.springcoredemo.service;

import dev.shreya.springcoredemo.entity.Release;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ReleaseService {
  public List<Release> findAll();
}
