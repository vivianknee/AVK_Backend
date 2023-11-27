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
                "When life gives you lemons, make lemonade", 
                "happy"
            ); 

            Art a2 = new Art(
                "Keep calm and carry on", 
                "sad"
            );

            Art a3 = new Art(
                "Believe in yourself, and you'll achieve great things.", 
                "sad"
            );

            Art a4 = new Art(
                "Happiness is a journey, not a destination.", 
                "sad"
            );

            repository.saveAll(
                    List.of(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15)
            );
        };
    }
}
