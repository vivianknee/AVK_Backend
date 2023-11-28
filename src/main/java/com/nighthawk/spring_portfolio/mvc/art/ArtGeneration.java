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
                "Vincent van Gogh",
                30,
                24
            );
            
            Art a2 = new Art(
                "Pablo Picasso",
                25,
                40
            );
            
            Art a3 = new Art(
                "Leonardo da Vinci",
                22,
                32
            );
            
            Art a4 = new Art(
                "Frida Kahlo",
                28,
                30
            );
            
            Art a5 = new Art(
                "Claude Monet",
                26,
                38
            );
            
            Art a6 = new Art(
                "Salvador Dali",
                32,
                28
            );
            
            Art a7 = new Art(
                "Georgia O'Keeffe",
                21,
                34
            );
            
            Art a8 = new Art(
                "Michelangelo",
                35,
                26
            );
            
            Art a9 = new Art(
                "Edvard Munch",
                27,
                36
            );
            
            Art a10 = new Art(
                "Rene Magritte",
                29,
                30
            );
            
            Art a11 = new Art(
                "Jackson Pollock",
                31,
                22
            );
            
            Art a12 = new Art(
                "Edgar Degas",
                24,
                32
            );
            
            Art a13 = new Art(
                "Henri Matisse",
                23,
                28
            );
            
            Art a14 = new Art(
                "Rembrandt",
                33,
                25
            );
            
            Art a15 = new Art(
                "Joan Miró",
                30,
                33
            );
            
            Art a16 = new Art(
                "Gustav Klimt",
                28,
                35
            );
            
            Art a17 = new Art(
                "Andy Warhol",
                26,
                40
            );
            
            Art a18 = new Art(
                "Paul Cézanne",
                25,
                31
            );
            
            Art a19 = new Art(
                "Caravaggio",
                32,
                27
            );
            
            Art a20 = new Art(
                "Hokusai",
                22,
                38
            );
            
            Art a21 = new Art(
                "Camille Pissarro",
                29,
                29
            );
            
            Art a22 = new Art(
                "Grant Wood",
                20,
                34
            );
            
            Art a23 = new Art(
                "Titian",
                34,
                24
            );
            
            Art a24 = new Art(
                "Amedeo Modigliani",
                27,
                29
            );
            
            Art a25 = new Art(
                "J.M.W. Turner",
                35,
                26
            );
            
            Art a26 = new Art(
                "Diego Rivera",
                31,
                30
            );
            
            Art a27 = new Art(
                "Kazimir Malevich",
                23,
                32
            );
            
            Art a28 = new Art(
                "Auguste Rodin",
                30,
                25
            );
            
            Art a29 = new Art(
                "Winslow Homer",
                26,
                37
            );
            
            Art a30 = new Art(
                "Yayoi Kusama",
                33,
                22
            );
            
            Art a31 = new Art(
                "Jean-Michel Basquiat",
                28,
                31
            );
            
            Art a32 = new Art(
                "Banksy",
                24,
                36
            );
            
            Art a33 = new Art(
                "Norman Rockwell",
                32,
                28
            );
            
            Art a34 = new Art(
                "Mary Cassatt",
                21,
                33
            );
            
            Art a35 = new Art(
                "Egon Schiele",
                29,
                27
            );
            
            Art a36 = new Art(
                "Pierre-Auguste Renoir",
                22,
                35
            );
            
            Art a37 = new Art(
                "Fernand Léger",
                25,
                30
            );
            
            Art a38 = new Art(
                "William Blake",
                33,
                23
            );
            
            Art a39 = new Art(
                "Käthe Kollwitz",
                26,
                32
            );
            
            Art a40 = new Art(
                "Paul Gauguin",
                30,
                28
            );
            
            Art a41 = new Art(
                "Marc Chagall",
                34,
                26
            );
            
            Art a42 = new Art(
                "Goya",
                31,
                29
            );
            
            Art a43 = new Art(
                "Eugène Delacroix",
                28,
                33
            );
            
            Art a44 = new Art(
                "William Turner",
                22,
                38
            );
            
            Art a45 = new Art(
                "Henri Rousseau",
                29,
                27
            );
            
            Art a46 = new Art(
                "Giuseppe Arcimboldo",
                25,
                35
            );
            
            Art a47 = new Art(
                "Hieronymus Bosch",
                30,
                24
            );
            
            Art a48 = new Art(
                "Klimt",
                33,
                29
            );
            
            Art a49 = new Art(
                "Joan Miró",
                24,
                32
            );

            Art a50 = new Art(
                "Leonetto Cappiello",
                29,
                30
            );
            
            repository.saveAll(
                    List.of(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40,a41, a42, a43, a44, a45, a46, a47, a48, a49, a50)
            );
        };
    }
}
