package com.bootcamp.testing.domain.repository.impl;

import com.bootcamp.testing.domain.repository.PersonRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class PersonRepositoryImpl implements PersonRepository {
    @Override
    public List<Integer> getSerie() {
        return List.of(6,7,8,9,0,1,1,2,3,4,5);
    }

    @Override
    public List<Integer> getSerieMutiplicador() {
        return List.of(3,2,7,6,5,4,3,2);
    }
}
