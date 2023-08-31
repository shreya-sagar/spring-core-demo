package dev.shreya.springcoredemo.repository;

import dev.shreya.springcoredemo.entity.Ticket;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket,Long> {

  List<Ticket> findAll();
}
