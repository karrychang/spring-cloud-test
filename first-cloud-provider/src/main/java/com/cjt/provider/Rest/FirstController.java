package com.cjt.provider.Rest;


import com.cjt.provider.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class FirstController {

    @GetMapping(value = "/person/{personId}",produces = "application/json")
    public Person findPerson(@PathVariable("personId")int personId, HttpServletRequest request){
        Person p = new Person(personId,"小明",11);
        p.setMessage(request.getRequestURL().toString());
        return p;
    }

}
