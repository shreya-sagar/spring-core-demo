package dev.shreya.springcoredemo;

import dev.shreya.springcoredemo.entity.Application;
import dev.shreya.springcoredemo.entity.Release;
import dev.shreya.springcoredemo.entity.Ticket;
import dev.shreya.springcoredemo.enums.Status;
import dev.shreya.springcoredemo.repository.ApplicationRepository;
import dev.shreya.springcoredemo.repository.ReleaseRepository;
import dev.shreya.springcoredemo.repository.TicketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCoreDemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringCoreDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationRepository applicationRepository,
			ReleaseRepository releaseRepository, TicketRepository ticketRepository) {
		return args -> {
			Application application1 = applicationRepository.save(new Application("demo1","demo1 desc","shreya"));
			Application application2 = applicationRepository.save(new Application("demo2","demo2 desc","sagar"));
			Application application3 = applicationRepository.save(new Application("demo3","demo3 desc","shreya"));
			Application application4 = applicationRepository.save(new Application("demo4","demo4 desc","sagar"));
			Application application5 = applicationRepository.save(new Application("demo5","demo5 desc","dey"));

			Release release1 = releaseRepository.save(new Release("31-08-2023","Release 31.08.2023"));
			Release release2 = releaseRepository.save(new Release("31-07-2023","Release 31.07.2023"));
			Release release3 = releaseRepository.save(new Release("31-06-2023","Release 31.06.2023"));
			Release release4 = releaseRepository.save(new Release("31-05-2023","Release 31.05.2023"));

			Ticket ticket1 = ticketRepository.save(new Ticket("Ticket 1", "Ticket 1 Description",
					application1, release1, Status.NEW.getStatus()));
			Ticket ticket2 = ticketRepository.save(new Ticket("Ticket 2", "Ticket 2 Description",
					application1, release1, Status.NEW.getStatus()));
			Ticket ticket3 = ticketRepository.save(new Ticket("Ticket 3", "Ticket 3 Description",
					application1, release1, Status.NEW.getStatus()));

			for(Application application : applicationRepository.findAll()) {
				LOGGER.info("Application : " + application.toString());
			}

			for(Release release : releaseRepository.findAll()) {
				LOGGER.info("Release : " + release.toString());
			}

			for(Ticket ticket : ticketRepository.findAll()) {
				LOGGER.info("Ticket : " + ticket.toString());
			}
		};
	}
}
