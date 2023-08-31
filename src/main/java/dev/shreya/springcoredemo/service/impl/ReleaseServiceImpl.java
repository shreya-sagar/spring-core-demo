package dev.shreya.springcoredemo.service.impl;

import dev.shreya.springcoredemo.entity.Release;
import dev.shreya.springcoredemo.repository.ReleaseRepository;
import dev.shreya.springcoredemo.service.ReleaseService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService {

  private ReleaseRepository releaseRepository;

  public ReleaseServiceImpl(ReleaseRepository releaseRepository) {
    this.releaseRepository = releaseRepository;
  }

  @Override
  public List<Release> findAll() {
    return releaseRepository.findAll();
  }
}
