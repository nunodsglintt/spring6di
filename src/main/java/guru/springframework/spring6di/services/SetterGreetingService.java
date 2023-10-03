package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Setter Greeting Service";
    }
}
