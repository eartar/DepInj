package com.eartar.DepInj.controllers;

import com.eartar.DepInj.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller//if missing, spring context will not recognize the bean
public class SetterInjectedController {

    //Qualifier is required bcs we have 3 different services, if missing will use the primary(if @Primary exists)
    @Qualifier("setterGreetingService")
    @Autowired//Requires the GreetingService anointed with @Service for injection
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
