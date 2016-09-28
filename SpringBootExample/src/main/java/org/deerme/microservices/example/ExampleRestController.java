package org.deerme.microservices.example;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.deerme.microservices.example.model.Player;
import org.deerme.microservices.example.model.Team;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
If we used @Controller, the method need's @ResponseBody, in the case @RestController
the method's don't need @ResponseBody
*/
//@Controller
@RestController
public class ExampleRestController {

	private Team team;

	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("John Deep", "Captain"));
		team = new Team("Santiago", "Santiago, Chile", players);

	}

	@RequestMapping("/team")
	// @ResponseBody
	public Team team() {
		return team;
	}
}
