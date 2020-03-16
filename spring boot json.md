# Spring boot 返回 json 数据的问题
1. spring boot 默认就添加了 jackson 的依赖。 使用 @RestController 就可以直接返回 json 数据。
    ```java
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
    ```

    由于 @RestController = @Controller + @ResponseBody, 所以也可以 @Controller + @ResponseBody 达到目的。
    ```java
    package org.example.controller;

    import org.example.bean.Person;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.ResponseBody;
    import org.springframework.web.bind.annotation.RestController;

    @Controller
    public class PersonController {

        @ResponseBody
        @RequestMapping("/getPerson")
        public Person getPerson() {

            Person p = new Person();
            p.setAge(18);
            p.setName("zhangsan");
            return p;
        }
    }

    ```