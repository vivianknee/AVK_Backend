package com.nighthawk.spring_portfolio.mvc.art;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ArtGeneration {

    @Bean
    CommandLineRunner commandLineRunner(
            ArtJpaRepository repository) {
        return args -> {
            Art a1 = new Art(
                "name of artist", 
                20,
                36
            ); 

            Art a2 = new Art(
                "name of artist", 
                20,
                36
            ); 

            repository.saveAll(
                    List.of(a1, a2)
            );
        };
    }
}
