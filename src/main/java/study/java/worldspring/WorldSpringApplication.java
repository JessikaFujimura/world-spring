package study.java.worldspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class WorldSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldSpringApplication.class, args);
	}

}
