package com.tms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // делает класс контроллером
@RequestMapping(value = "/main-path") //  будет перед всеми путями методов
public class HelloController {
    @GetMapping("/hello/{number}")
    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHelloPage(@PathVariable int number) {
        System.out.println(number);
        // logic(Service -> Repository)
        return "HelloMVC";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getSecondHelloPage(@RequestParam("number") int number) {
        System.out.println(number);
        // logic(Service -> Repository)
        return "HelloMVC";
    }
}
