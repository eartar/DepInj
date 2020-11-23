package com.eartar.DepInj.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
ES profile is required in application.properties for this service to be
running in the swing app context. Currently it is disabled, so this service
is not accessible in the context; the I18nController will ignore it


@Service parameter will change the default bean name from i18nSpanish zGreetingService to
i18nService. Since we have 2 i18nService services, they must be differentiated with a profile
or the sprint framework cant differentiate between two - "default" works like @Primary
 */
@Profile({"ES", "default"})
@Service("i18nService") //will change the bean name from i18nEnglishGreetingService to i18nService
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - Espanol";
    }
}
