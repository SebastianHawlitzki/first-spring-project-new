package de.neuefische.firstspringprojectnew.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/helloworld")
public class GreetingsController {
    private String name = "";

    @GetMapping
    public String helloWorldController() {
        return "Hello World!" + name;
    }

    @GetMapping("/en")
    public String sayHello() {
        return "Servus";
    }

   /*
   @GetMapping(path = "{name}")
    public String sayHello2(@PathVariable String name, @RequestParam String q){
       // return q + " " + name;
   }

    */

    @PostMapping
    public String postName(@RequestBody String newName) {
        name = newName;
        return "Name was set to: " + name;
    }

    // Aufgabe
    @GetMapping(path = "{name}")
    public String firstName(@PathVariable String name, @RequestParam String greeting) {
        return greeting + " " + name;
    }

}
