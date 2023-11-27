package com.nighthawk.spring_portfolio.mvc.quote;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@TypeDef(name="json", typeClass=JsonType.class)
@Table(name = "art")


public class Art {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Size(min=5)
    @Column(unique=true)

    private String name; 
    private Integer years;
    private Integer age; 

    public Art(String name, Integer years, Integer age) {
        this.name = name; 
        this.years = years; 
        this.age = age;
   }

}


