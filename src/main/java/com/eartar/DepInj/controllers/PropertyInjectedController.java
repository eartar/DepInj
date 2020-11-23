package com.eartar.DepInj.controllers;

import com.eartar.DepInj.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller //if missing, spring context will not recognize the bean
public class PropertyInjectedController {

    //Qualifier is required bcs we have 3 different services, if missing will
    //use the primary(if one of the services have @Primary exists - see PrimaryGreetingService and MyController )
    @Qualifier("propertyGreetingService")
    @Autowired //Requires the GreetingService anointed with @Service for injection
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
