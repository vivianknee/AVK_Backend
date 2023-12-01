package com.nighthawk.spring_portfolio.mvc.art;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data  
@NoArgsConstructor
@AllArgsConstructor
@Entity  

public class Art {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique=true)
    //artist stats
    private String name; 
    private Integer years;
    private Integer age; 

    //likes
    private int up;

    public Art(String name, Integer years, Integer age) {
        this.name = name; 
        this.years = years; 
        this.age = age;
   }

}


