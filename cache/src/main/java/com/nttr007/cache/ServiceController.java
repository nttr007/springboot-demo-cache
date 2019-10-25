package com.nttr007.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class ServiceController {
    
 
 @PostMapping("/add")   
 public ResponseEntity<Person> addPerson(@RequestBody Person person){

        return new ResponseEntity(person, HttpStatus.OK);
 }   

 @GetMapping("/{id}")
 public ResponseEntity<Person> getPerson(@PathVariable("id" ) String id){

    return null;

 }

}