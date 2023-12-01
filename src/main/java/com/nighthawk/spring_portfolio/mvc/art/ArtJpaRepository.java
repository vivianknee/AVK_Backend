package com.nighthawk.spring_portfolio.mvc.art;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtJpaRepository extends JpaRepository<Art, Long> {
    //void save(String name); 
    Art findByNameArt(String name);
    List<Art> findAllByOrderByArtDsc();
    List<Art> findByYearsArts(Integer years);
    List<Art> findByAgeArts(Integer age);
}



// void save(String Joke);
//     List<Jokes> findAllByOrderByJokeAsc();
//     List<Jokes> findByJokeIgnoreCase(String joke);