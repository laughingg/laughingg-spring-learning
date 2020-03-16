package org.example.controller;

import org.example.bean.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping("/getPerson")
    public Person getPerson() {

        Person p = new Person();
        p.setAge(18);
        p.setName("zhangsan");
        return p;
    }
}
