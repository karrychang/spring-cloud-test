package com.cjt.cloud.provider.Rest;

import com.cjt.cloud.provider.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(value = "/person/{personId}",produces = "application/json")
    public Person findPerson(@PathVariable("personId")int personId){
        Person p = new Person(personId,"小明",11);
        return p;
    }

}
