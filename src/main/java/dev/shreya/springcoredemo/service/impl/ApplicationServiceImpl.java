package dev.shreya.springcoredemo.service.impl;

import dev.shreya.springcoredemo.entity.Application;
import dev.shreya.springcoredemo.repository.ApplicationRepository;
import dev.shreya.springcoredemo.service.ApplicationService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {

  private ApplicationRepository applicationRepository;

  public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
    this.applicationRepository = applicationRepository;
  }

  @Override
  public List<Application> findAll() {
    return applicationRepository.findAll();
  }
}
