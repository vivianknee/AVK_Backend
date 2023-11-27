package com.nighthawk.spring_portfolio.mvc.art;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtService {
    
    private final ArtJpaRepository artRepository; 

    @Autowired
    public ArtService(ArtJpaRepository artRepository) {
        this.artRepository = artRepository;
    }

    public void saveQuotes(Art[] arts){
        for (Art art:  arts){
            artRepository.save(art);
        }
    }
}
