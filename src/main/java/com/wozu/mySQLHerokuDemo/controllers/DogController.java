package com.wozu.mySQLHerokuDemo.controllers;

import com.wozu.mySQLHerokuDemo.models.Dog;
import com.wozu.mySQLHerokuDemo.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DogController {
    final DogService dogService;

    @Autowired
    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/dogs")
    Iterable<Dog> getAllDogs() {
        return dogService.getAllDogs();
    }

    @PostMapping("/create/dog")
    Dog createDog() {
        Dog dog = dogService.getDogFromDogApi();
        return dogService.postDogFromDogApi(dog);
    }
}
