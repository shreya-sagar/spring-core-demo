package dev.shreya.springcoredemo.repository;

import dev.shreya.springcoredemo.entity.Application;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application,Long> {

  List<Application> findAll();
}
