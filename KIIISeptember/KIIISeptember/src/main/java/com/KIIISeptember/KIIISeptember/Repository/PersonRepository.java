package com.KIIISeptember.KIIISeptember.Repository;

import com.KIIISeptember.KIIISeptember.Model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, Integer> {

}
