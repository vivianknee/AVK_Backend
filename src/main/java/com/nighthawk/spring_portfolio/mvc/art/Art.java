package com.nighthawk.spring_portfolio.mvc.art;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity 
public class Art {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique=true)
    private String artName;

    private int like;

    public static String[] init() {
        final String[] artArray = {
            "The Old Guitarist",
            "Irises",
            "The Persistence of Memory",
            "The Scream",
            "Girl with a Pearl Earring",
            "The Birth of Venus",
            "The Kiss",
            "Guernica",
            "The Great Wave off Kanagawa",
            "Mona Lisa",
            "American Gothic",
            "Water Lilies",
            "Les Demoiselles d'Avignon",
            "Whistler's Mother",
            "The Last Supper",
            "Nighthawks",
            "The Starry Night",
            "Sunflowers",
            "The Son of Man"
        };
        return artArray;
    }
}