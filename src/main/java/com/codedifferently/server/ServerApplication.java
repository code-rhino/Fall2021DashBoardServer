package com.codedifferently.server;

import com.codedifferently.server.domain.pokemon.models.moves.Move;
import com.codedifferently.server.domain.pokemon.models.Pokemon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServerApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(ServerApplication.class);
    private static String url = "https://api.openweathermap.org/data/2.5/weather?q=philadelphia&appid=1b4752e8f72420b8fb795feae46400d9";
    private static String yourPokeURL = "https://pokeapi.co/api/v2/pokemon/charizard";

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate(); //pulling info from the database and translating it as an object
        Pokemon data = restTemplate.getForObject(yourPokeURL, Pokemon.class);
        Move move = data.getMoves().get(0);
        logger.info("{}", move.getData().toString());




    }
}
