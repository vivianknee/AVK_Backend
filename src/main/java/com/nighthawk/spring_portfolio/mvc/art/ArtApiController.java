package com.nighthawk.spring_portfolio.mvc.art;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // annotation to simplify the creation of RESTful web services
@RequestMapping("/api/artworks") 

public class ArtApiController {
    @Autowired
    private ArtJpaRepository repository;

    @GetMapping("/")
    public ResponseEntity<List<Art>> getArt() {
        // ResponseEntity returns List of Jokes provide by JPA findAll()
        return new ResponseEntity<>( repository.findAll(), HttpStatus.OK);
    }

    //Update Like
    @PostMapping("/like/{id}")
    public ResponseEntity<Art> setLike(@PathVariable long id) {
    
        Optional<Art> optional = repository.findById(id);
        if (optional.isPresent()) {  // Good ID
            Art art = optional.get();  // value from findByID
            art.setLike(art.getLike()+1); // increment value
            repository.save(art);  // save entity
            return new ResponseEntity<>(art, HttpStatus.OK);  // OK HTTP response: status code, headers, and body
        }
        // Bad ID
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);  // Failed HTTP response: status code, headers, and body
    }

    
}