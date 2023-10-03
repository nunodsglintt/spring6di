package guru.springframework.spring6di.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service("envService")
public class EnvironmentServiceProd implements EnvironmentService {
    @Override
    public String findEnvironment() {
        return "We're in the production environment";
    }
}
