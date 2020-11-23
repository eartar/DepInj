package com.eartar.DepInj.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
EN profile is required in application.properties for this service to be
running in the swing app context. Currently it is enabled, so this service
is accessible in the context and since it is the only i18nService; the
I18nController will default into using it

@Service parameter will change the default bean name from i18nEnglishGreetingService to
i18nService. Since we have 2 i18nService services, they must be differentiated with a profile
or the sprint framework cant differentiate between two - "default" works like @Primary
 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - English";
    }
}
