package com.bootcamp.testing.domain.services;

import com.bootcamp.testing.domain.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
class PersonDomainServiceStarterTest {

    @Autowired
    private PersonDomainService personDomainService;

    @MockBean
    private PersonRepository personRepository;


    @Test
    void checkDigitDni() {
        var valorEsperado  = 9;

        var serieMultiplicador = List.of(8,8,8,8,8,8,8,8);
        var serieMock = List.of(9,9,9,9,9,9,9,9,9,9,9);

        when(this.personRepository.getSerieMutiplicador()).thenReturn(serieMultiplicador);
        when(this.personRepository.getSerie()).thenReturn(serieMock);

        var valorActual= this.personDomainService.checkDigitDni("43012421");

        assertEquals(valorEsperado, valorActual);

    }
}