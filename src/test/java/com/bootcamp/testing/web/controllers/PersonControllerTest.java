package com.bootcamp.testing.web.controllers;

import com.bootcamp.testing.domain.services.PersonDomainService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class PersonControllerTest {

    @MockBean
    private PersonDomainService personDomainService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void checkDigitDni() throws Exception {

        // A: Arrange
        Integer valorEsperado = 0;
        Integer valorMock = 2;

        when(this.personDomainService.checkDigitDni("43012421")).thenReturn(valorMock);
        MvcResult result = this.mockMvc
                .perform(MockMvcRequestBuilders.get("/persons/checkDni/43012421"))
                .andExpect(status().isOk())
                .andReturn();

        // A: Act

        String content = result.getResponse().getContentAsString();
        Integer valorReal = this.objectMapper.readValue(content, Integer.class );

        // A: Assert
        assertEquals(valorEsperado, valorReal);


    }
}