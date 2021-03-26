package com.bootcamp.testing;

public class Calculadora {
    Integer sumar(Integer a, Integer b){
        return a + b;
    }

    Integer restar(Integer a, Integer b){
        return a-b;
    }
    Integer multiplicar(Integer a, Integer b){
        return a * b;
    }
    Integer dividir(Integer a,Integer b){
        return b.equals(0) ? 0 : a/b;
    }
}
