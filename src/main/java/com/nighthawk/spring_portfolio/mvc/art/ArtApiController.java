package com.nighthawk.spring_portfolio.mvc.art;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nighthawk.spring_portfolio.mvc.sorting.Bubble;
import com.nighthawk.spring_portfolio.mvc.sorting.Insertion;
import com.nighthawk.spring_portfolio.mvc.sorting.Merge;
import com.nighthawk.spring_portfolio.mvc.sorting.Selection;
import com.nighthawk.spring_portfolio.mvc.sorting.Sorting;
import com.nighthawk.spring_portfolio.mvc.sorting.SortingResult;

import java.util.List;
import java.util.Optional;

@RestController // annotation to simplify the creation of RESTful web services
@RequestMapping("/api/art")  // all requests in file begin with this URI
public class ArtApiController {
    // Autowired enables Control to connect URI request and POJO Object to easily for Database CRUD operations
    @Autowired
    private ArtJpaRepository repository;

    /* GET List of Jokes
     * @GetMapping annotation is used for mapping HTTP GET requests onto specific handler methods.
     */
    @GetMapping("/")
    public ResponseEntity<List<Art>> getArts() {
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

    @PostMapping("/sorted/{method}")
    public ResponseEntity<SortingResult> getSortedArts(@PathVariable String method) throws Exception {
        // ResponseEntity returns List of Jokes provide by JPA findAll()
        List<Art> arts = repository.findAll();

        Sorting sorter = new Bubble();
        if (method.contains("bubble")) {
            sorter = new Bubble();
        }
        else if (method.contains("insertion")) {
            sorter = new Insertion();
        }
        else if (method.contains("merge")) {
            sorter = new Merge();
        }
        else if (method.contains("selection")) {
            sorter = new Selection();
        }
        else {
            throw new Exception(method);
        }

        // use your sorting class here to sort the list
        SortingResult sortResult = sorter.getSortingResult(arts);

        return new ResponseEntity<>(sortResult, HttpStatus.OK);
    }
}
