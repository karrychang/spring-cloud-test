package com.cjt.cloud.provider.Rest;

import com.cjt.cloud.provider.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping(value = "/person/{personId}",produces = "application/json")
    public Person findPerson(){
        Person p = new Person(1,"小明",11);
        return p;
    }

}
