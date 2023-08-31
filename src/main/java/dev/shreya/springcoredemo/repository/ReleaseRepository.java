package dev.shreya.springcoredemo.repository;

import dev.shreya.springcoredemo.entity.Release;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release,Long> {

  List<Release> findAll();
}
