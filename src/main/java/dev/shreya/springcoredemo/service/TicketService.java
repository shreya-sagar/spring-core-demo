package dev.shreya.springcoredemo.service;

import dev.shreya.springcoredemo.entity.Ticket;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface TicketService {

  public List<Ticket> findAll();
}
