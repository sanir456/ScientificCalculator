package com.spe.ScientificCalculator;

import org.apache.logging.log4j.LogManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.Logger;


@RestController
public class Calculator {
    private static final Logger logger =  LogManager.getLogger(Calculator.class);

    @RequestMapping(value = "/power",method = RequestMethod.POST)
    public double power(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        double input2 = Double.parseDouble((String) payload.get("input2"));
        logger.info("[POWER] - " + input1 + "^"+input2);
        res = Math.pow(input1,input2);
        logger.info("[RESULT] - " + res);
        return res  ;
    }


    @RequestMapping(value = "/sqrt",method = RequestMethod.POST)
    public double sqrt(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        logger.info("[SQRT] - " + input1);
        res = Math.sqrt(input1);
        logger.info("[RESULT] - " + res);
        return res  ;
    }

    @RequestMapping(value = "/fact",method = RequestMethod.POST)
    public double fact(@RequestBody Map<String,Object> payload){
        double res= 1;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        logger.info("[FACT] - " + input1);

        for(double i=1;i<=input1;i++)
            res = res*i;
        logger.info("[RESULT] - " + res);

        return res;
    }

    @RequestMapping(value = "/log",method = RequestMethod.POST)
    public double log(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        logger.info("[LOG] - " + input1);
        res = Math.log(input1);
        logger.info("[RESULT] - " + res);

        return res  ;
    }


}
