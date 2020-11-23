package com.eartar.DepInj.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*
- must be anointed so other classes can use inject with this class object
- very similar to singleton architecture, this is the "spring" way of using this class' singleton
object for dependency injection
*/
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - Constructor";
    }
}
