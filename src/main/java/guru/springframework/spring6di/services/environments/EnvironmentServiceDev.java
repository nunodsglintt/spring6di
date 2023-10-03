package guru.springframework.spring6di.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service("envService")
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String findEnvironment() {
        return "We're in the development environment";
    }
}
