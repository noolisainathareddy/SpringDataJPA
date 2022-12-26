package com.sai.datajpa;

import com.sai.datajpa.entity.Player;
import com.sai.datajpa.repository.PlayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DatajpaApplication.class, args);

		PlayerRepository playerRepository = context.getBean(PlayerRepository.class);

		Player player= new Player();
		player.setPlayerId(81234);
		player.setPlayerName("Hemanth");
		player.setPlayerAge(28);
		player.setLocation("AndhraPradesh");

		playerRepository.save(player);
	}

}
