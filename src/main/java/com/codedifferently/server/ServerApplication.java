package com.codedifferently.server;

import com.codedifferently.server.domain.pokemon.models.GameIndex;
import com.codedifferently.server.domain.pokemon.models.Pokemon;
import com.codedifferently.server.domain.weather.models.*;
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
    private static String yourPokeUrL = "https://pokeapi.co/api/v2/pokemon/charizard";
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Pokemon data = restTemplate.getForObject(yourPokeUrL, Pokemon.class);
        logger.info("{}",data.getBaseExperience());
    for(GameIndex gIndex: data.getGameIndices()){
        logger.info(gIndex.toString());
    }
        GameIndex gameIndex = data.getGameIndices().get(0);
//        WeatherData response = restTemplate.getForObject(url, WeatherData.class);
//        logger.info("The Base is {}, The Lat is {}",response.getBase(), response.getCoord().getLat());
//        Weather weather = response.getWeather().get(0);
//        logger.info(weather.toString());
//
//        Main main = response.getMain();
//        logger.info(response.getMain().toString());
//
//        Sys sys = response.getSys();
//        logger.info(response.getSys().toString());
//
//        Wind wind = response.getWind();
//        logger.info(response.getWind().toString());
    }
}
