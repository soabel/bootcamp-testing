package com.bootcamp.testing.web.controllers;

import com.bootcamp.testing.domain.services.PersonDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persons")
public class PersonController {

    @Autowired
    private PersonDomainService personDomainService;

    @GetMapping("checkDni/{dni}")
    Integer checkDigitDni(@PathVariable String dni){
        var digitoFinal =  this.personDomainService.checkDigitDni(dni);

        if(digitoFinal > 3){
            return 1;
        }else{
            return 0;
        }

    }

}
