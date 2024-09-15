package cat.itacademy.s04.t01.n01.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String greet(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + "! You are running a Gradle project";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greet2(@PathVariable(required = false) String name) {
        if (name == null) {
            name = "UNKNOWN";
        }
        return "Hello, " + name + "! You are running a Gradle project";
    }
}