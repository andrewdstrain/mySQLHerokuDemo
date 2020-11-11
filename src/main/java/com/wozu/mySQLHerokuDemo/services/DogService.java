package com.wozu.mySQLHerokuDemo.services;

import com.wozu.mySQLHerokuDemo.models.Dog;

public interface DogService {
    Dog getDogFromDogApi();
    Dog postDogFromDogApi(Dog dog);
    Iterable<Dog> getAllDogs();
}
