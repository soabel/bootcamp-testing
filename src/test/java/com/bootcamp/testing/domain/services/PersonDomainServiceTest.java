package com.bootcamp.testing.domain.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonDomainServiceTest {

    @Autowired
    private PersonDomainService personDomainService;

    @Test
    void checkDigitDni(){
        Integer valorEsperado = 3;
        Integer valorReal = personDomainService.checkDigitDni("43012421");
        assertEquals(valorEsperado, valorReal);
    }

}