package com.codedifferently.server;

import com.codedifferently.server.domain.weather.models.Weather;
import com.codedifferently.server.domain.weather.models.WeatherData;
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

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        WeatherData response = restTemplate.getForObject(url, WeatherData.class);
        logger.info("The Base is {}, The Lat is {}",response.getBase(), response.getCoord().getLat());
        Weather weather = response.getWeather().get(0);
        logger.info(weather.toString());
    }
}
