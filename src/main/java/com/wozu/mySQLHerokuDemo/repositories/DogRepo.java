package com.wozu.mySQLHerokuDemo.repositories;

import com.wozu.mySQLHerokuDemo.models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends CrudRepository<Dog, Long> {
}
