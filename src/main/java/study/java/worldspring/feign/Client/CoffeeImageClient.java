package study.java.worldspring.feign.Client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import study.java.worldspring.feign.Response.CoffeeImage;

@Component
public class CoffeeImageClient {

    private final String url = "https://coffee.alexflipnote.dev/random.json";

    public CoffeeImage getRandomImageOfCoffee(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, CoffeeImage.class);
    }
}