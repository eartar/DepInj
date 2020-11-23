package com.eartar.DepInj.controllers;

import com.eartar.DepInj.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller//if missing, spring context will not recognize the bean
public class ConstructorInjectedController {

    //@Autowired is not required, constructor based DI recognices the parameters of the constructor
    private final GreetingService greetingService;

    //Qualifier is required bcs we have 3 different services, if missing will use the primary(if @Primary exists)
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
