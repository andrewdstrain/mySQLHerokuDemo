package com.wozu.mySQLHerokuDemo.services;

import com.wozu.mySQLHerokuDemo.models.Dog;
import com.wozu.mySQLHerokuDemo.repositories.DogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DogServiceImpl implements DogService {
    final DogRepo dogRepo;

    @Autowired
    public DogServiceImpl(DogRepo dogRepo) {
        this.dogRepo = dogRepo;
    }

    @Override
    public Dog getDogFromDogApi() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://dog.ceo/api/breeds/image/random", Dog.class);
    }

    @Override
    public Dog postDogFromDogApi(Dog dog) {
        return dogRepo.save(dog);
    }

    @Override
    public Iterable<Dog> getAllDogs() {
        return dogRepo.findAll();
    }
}
