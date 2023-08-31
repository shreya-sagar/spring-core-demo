package dev.shreya.springcoredemo.service.impl;

import dev.shreya.springcoredemo.entity.Ticket;
import dev.shreya.springcoredemo.repository.TicketRepository;
import dev.shreya.springcoredemo.service.TicketService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

  private TicketRepository ticketRepository;

  public TicketServiceImpl(TicketRepository ticketRepository) {
    this.ticketRepository = ticketRepository;
  }

  @Override
  public List<Ticket> findAll() {
    return ticketRepository.findAll();
  }
}
