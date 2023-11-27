package com.nighthawk.spring_portfolio.mvc.art;

import java.util.Random;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nighthawk.spring_portfolio.mvc.jokes.Jokes;
import com.nighthawk.spring_portfolio.mvc.quote.Art;


@RestController
@CrossOrigin(origins = {"http://127.0.0.1:5500", "http://127.0.0.1:4100"})
@RequestMapping(path = "/api/art")

public class ArtApiController {

    @Autowired
    private ArtJpaRepository repository; 

    @GetMapping
    public ResponseEntity<List<Art>> getArt() {
        return new ResponseEntity<>( repository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Art> addArt(@RequestBody Art newArt) {
        Art savedArt = repository.save(newArt);
        return new ResponseEntity<>(savedArt, HttpStatus.CREATED);
    }

    @PostMapping("/like/{id}")
    public ResponseEntity<Art> setLike(@PathVariable long id) {
        /* 
        * Optional (below) is a container object which helps determine if a result is present. 
        * If a value is present, isPresent() will return true
        * get() will return the value.
        */
        Optional<Art> optional = repository.findById(id);
        if (optional.isPresent()) {  // Good ID
            Art art = optional.get();  // value from findByID
            art.setHaha(art.getHaha()+1); // increment value
            repository.save(art);  // save entity
            return new ResponseEntity<>(art, HttpStatus.OK);  // OK HTTP response: status code, headers, and body
        }
        // Bad ID
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);  // Failed HTTP response: status code, headers, and body
    }

    /* Update Jeer
     */
    @PostMapping("/dislike/{id}")
    public ResponseEntity<Art> setDislike(@PathVariable long id) {
        Optional<Art> optional = repository.findById(id);
        if (optional.isPresent()) {  // Good ID
            Art art = optional.get();
            art.setBoohoo(art.getBoohoo()+1);
            repository.save(art);
            return new ResponseEntity<>(art, HttpStatus.OK);
        }
        // Bad ID
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Art> updateArt(@PathVariable Long id, @RequestBody Art updatedArt) {
        Art existingArt = repository.findById(id).orElse(null);
    
        if (existingArt == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        existingArt.setYears(updatedArt.getYears());
        existingArt.setAge(updatedArt.getAge());
        existingArt.setArt(updatedArt.getArt());
        
        Art savedArt = repository.save(existingArt);
        return new ResponseEntity<>(savedArt, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteArt(@PathVariable Long id) {
        Art existingArt = repository.findById(id).orElse(null);
    
        if (existingArt == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        repository.delete(existingArt);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
