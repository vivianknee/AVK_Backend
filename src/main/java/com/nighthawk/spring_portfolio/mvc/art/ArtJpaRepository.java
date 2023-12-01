package com.nighthawk.spring_portfolio.mvc.art;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ArtJpaRepository extends JpaRepository<Art, Long> {
    void save(String Art);
    List<Art> findAllByOrderByArtDsc();
    List<Art> findByArtIgnoreCase(String art);
}
