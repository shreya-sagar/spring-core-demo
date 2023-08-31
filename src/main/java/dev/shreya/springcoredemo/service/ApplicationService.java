package dev.shreya.springcoredemo.service;

import dev.shreya.springcoredemo.entity.Application;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ApplicationService {

  public List<Application> findAll();

}
