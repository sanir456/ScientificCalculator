package com.spe.ScientificCalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @RequestMapping(value = "/welcome",method = RequestMethod.POST)
    public String welcome(){
        String text="private page";
        System.out.println("in welcom metho");
        return text;
    }
}
