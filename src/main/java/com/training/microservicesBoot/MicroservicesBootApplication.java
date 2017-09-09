package com.training.microservicesBoot;

import com.training.microservicesBoot.DAO.TeamDAO;
import com.training.microservicesBoot.domain.Player;
import com.training.microservicesBoot.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {
	/*
	* When running as a JAR
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}

	/*
	* When running as a WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return builder.sources(MicroservicesBootApplication.class);
	}

	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<>();
		players.add(new Player("Charlie Brown", "pitcher"));
		players.add(new Player("Snoopy", "shortstop"));

		Team team = new Team("California", "Peanuts", players);

		teamDAO.save(team);

	}

	@Autowired
	TeamDAO teamDAO;


}