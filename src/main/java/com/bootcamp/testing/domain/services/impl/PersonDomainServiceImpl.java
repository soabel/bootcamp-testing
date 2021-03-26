package com.bootcamp.testing.domain.services.impl;

import com.bootcamp.testing.domain.services.PersonDomainService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonDomainServiceImpl implements PersonDomainService {

    public Integer checkDigitDni(String s) {
        var auxiliarBase = 11;
        var auxiliarSecundario = 1;
        var serieMultiplicador= List.of(3,2,7,6,5,4,3,2);
        var serieDePosicion= List.of(6,7,8,9,0,1,1,2,3,4,5);

         var array = s.split("");
         
         var enteros = Arrays
                 .stream(array).map( a -> Integer.parseInt(a))
                 .collect(Collectors.toList());

         var sumaMultiplicadores = 0;
         for(int i=0; i<enteros.size(); i++){
             sumaMultiplicadores += enteros.get(i) * serieMultiplicador.get(i);
         }

         var resultado = sumaMultiplicadores % auxiliarBase;

         resultado = auxiliarBase - resultado;
         resultado = auxiliarSecundario + resultado;
         resultado = serieDePosicion.get(resultado-1);


        return resultado;
    }
}
