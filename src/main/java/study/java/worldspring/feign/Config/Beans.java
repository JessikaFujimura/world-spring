package study.java.worldspring.feign.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.java.worldspring.feign.Client.CoffeeImageClient;
import study.java.worldspring.feign.Client.ViaCepClient;
import study.java.worldspring.feign.Response.Address;
import study.java.worldspring.feign.Response.CoffeeImage;

@Configuration
public class Beans {


    @Bean
    public CommandLineRunner run(ViaCepClient viaCepClient){
        return args -> {
            if (args.length > 0 ) {
                String cep = args[0];
                Address address = viaCepClient.searchAddressFor(cep);
                System.out.println(address);
            }
        };
    }

    @Bean
    public CommandLineRunner run2(CoffeeImageClient imageClient){
        return args -> {
            CoffeeImage coffeeImage = imageClient.getRandomImageOfCoffee();
            System.out.println(coffeeImage);
        };
    }
}
