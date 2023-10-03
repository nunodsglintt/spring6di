package guru.springframework.spring6di.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("envService")
public class EnvironmentServiceUat implements EnvironmentService {
    @Override
    public String findEnvironment() {
        return "We're in the user acceptance test environment";
    }
}
