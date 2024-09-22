package com.KIIISeptember.KIIISeptember.Controller;

import com.KIIISeptember.KIIISeptember.Model.Person;
import com.KIIISeptember.KIIISeptember.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    PersonRepository studentRepo;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person) {
        studentRepo.save(person);
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<Person>> getAll() {
        return ResponseEntity.ok(this.studentRepo.findAll());
    }

}
