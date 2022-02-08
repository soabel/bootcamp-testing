package com.bootcamp.testing;

public class Calculadora {

    // Implementar un metodo para verificar si un número es primo.
    // Verificar si un número es capicua.  1881


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
//        return b.equals(0) ? 0 : a/b;

        if( b.equals(0)){
            return  0;
        }else{
            return a/b;
        }

    }
}
