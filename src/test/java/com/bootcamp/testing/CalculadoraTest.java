package com.bootcamp.testing;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


// TEST  - Patron AAA
// A    : Arrange (Preparar)
// A    : Act (Actuar)
// A    : Assert (Afirmar)

@SpringBootTest
class CalculadoraTest {

    private static Calculadora calculadora;

    @BeforeAll
    static void beforeAll(){
        calculadora = new Calculadora();
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("beforeEach" );
    }

    @Test
    void sumar_OK() {

        // A    : Arrange (Preparar)
        var valorEsperado = 9;

        // A    : Act (Actuar)
        var valorReal = calculadora.sumar(5,4);

        // A    : Assert (Afirmar)
        assertEquals(valorEsperado,valorReal);

    }

    @Test
    void sumar_fail() {

        var valorEsperado = 7;
        var valorReal = calculadora.sumar(5,4);

        assertNotEquals(valorEsperado,valorReal);

    }

    @Test
    void restar_OK() {

        var valorEsperado = 3;
        var valorReal = calculadora.restar(5,2);

        assertEquals(valorEsperado,valorReal);
    }

    @AfterEach
    void afterEach(){
        System.out.println("afterEach");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }
}