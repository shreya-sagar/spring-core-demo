package dev.shreya.springcoredemo.service.impl;

import dev.shreya.springcoredemo.entity.Application;
import dev.shreya.springcoredemo.exception.ApplicationNotFoundException;
import dev.shreya.springcoredemo.repository.ApplicationRepository;
import dev.shreya.springcoredemo.service.ApplicationService;
import java.util.List;
import java.util.Optional;
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

  @Override
  public Application findById(Long id) {
    Optional<Application> application = applicationRepository.findById(id);
    if(application.isPresent()) {
      return application.get();
    } else {
      throw new ApplicationNotFoundException("Application Not Found for ID " + id);
    }
  }
}
