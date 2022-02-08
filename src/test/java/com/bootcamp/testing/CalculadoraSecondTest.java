package com.bootcamp.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSecondTest {

    private static Calculadora calculadora;

    @BeforeAll
    static void  beforeALl(){
        calculadora= new Calculadora();
    }

    @Test
    void sumar() {
    }

    @Test
    void restar() {
    }

    @Test
    void multiplicar() {
    }

    @Test()
    void dividir() {
        // A: Arrange
        var valorEsperado = 5;
        //A: Act
        var valorActual= calculadora.dividir(10,2);
        //A: Assert
        assertEquals(valorEsperado,valorActual);

    }

    @Test
    void dividir_por_cero(){

        // A: Arrange
        var  valorEsperado = 0;
        //A: Act
        var valorActual= calculadora.dividir(10,0);
        //A: Assert
        assertEquals(valorEsperado,valorActual);

    }
}