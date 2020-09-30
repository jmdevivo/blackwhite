package org.devivo.blackwhite;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.devivo.blackwhite.model.*;

@SpringBootApplication
public class Application {

    public static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(GameDao gameRepo){
        return (args) -> {
            //save a few games
            gameRepo.save(new Game("John", "Devivo"));
            gameRepo.save(new Game("Julia", "Devivo"));
            gameRepo.save(new Game("Ben", "Hartman"));

            //find all games
            for(Game game: gameRepo.findAll()){
                log.info(game.toString());
            }
            log.info("");

            //fetch individual customer by id
            Game game = gameRepo.findById(1l);
            log.info("Game found with findById(1)");
            log.info("-----------------------------");
            log.info(game.toString());
            log.info("");

            //fetch Game by lastName
            log.info("Game found with findByLastName(\"Devivo\"");
            log.info("--------------------------------------------");
            gameRepo.findByLastName("Devivo").forEach(devivo -> {
                log.info(devivo.toString());
            });
            log.info("");

        };
    }
}
