package dev.shreya.springcoredemo.controller;

import dev.shreya.springcoredemo.entity.Application;
import dev.shreya.springcoredemo.entity.Release;
import dev.shreya.springcoredemo.entity.Ticket;
import dev.shreya.springcoredemo.service.ApplicationService;
import dev.shreya.springcoredemo.service.ReleaseService;
import dev.shreya.springcoredemo.service.TicketService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/home")
public class HomeController {

  private ApplicationService applicationService;
  private ReleaseService releaseService;
  private TicketService ticketService;

  public HomeController(ApplicationService applicationService, ReleaseService releaseService,
      TicketService ticketService) {
    this.applicationService = applicationService;
    this.releaseService = releaseService;
    this.ticketService = ticketService;
  }

  @GetMapping("/application")
  public String allApplications(Model model) {
    model.addAttribute("applications", applicationService.findAll());
    return "application";
  }

  @GetMapping("/release")
  public String allReleases(Model model) {
    model.addAttribute("releases", releaseService.findAll());
    return "release";
  }

  @GetMapping("/ticket")
  public String allTickets(Model model) {
    model.addAttribute("tickets", ticketService.findAll());
    return "ticket";
  }

}
