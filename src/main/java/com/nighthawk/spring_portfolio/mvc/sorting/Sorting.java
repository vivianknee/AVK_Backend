package com.nighthawk.spring_portfolio.mvc.sorting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

 import java.util.HashMap;
 import jakarta.persistence.*;


public class Sorting {

    protected long finalTime;

    public Sorting() {
        this.finalTime = 0;
    }

    public long getFinalTime() {
        return finalTime;
    }

    public Integer[][] sort(HashMap<String, Integer> likes) {
        long startTime = System.nanoTime();
        Integer[][] result = sortArt(likes);
        long endTime = System.nanoTime();
        finalTime = endTime - startTime;
        return result;
    }

    protected Integer[][] sortArt(HashMap<String, Integer> likes) {
        return null;  
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Data
    public class Art {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(unique=true)
        private String artName;

        private int like;

        public static String[] init() {
            final String[] artArray = {
                "Starry Starry Night",
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
    
}