package co.ground.gauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootGauthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootGauthApplication.class, args);
    }
}