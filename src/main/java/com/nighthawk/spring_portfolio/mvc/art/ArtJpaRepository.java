package com.nighthawk.spring_portfolio.mvc.art;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtJpaRepository extends JpaRepository<Art, Long> {
    //void save(String name); 
    List<Art> findByYearsIgnoreCase(String years);
    List<Art> findByAgeIgnoreCase(String age);
}