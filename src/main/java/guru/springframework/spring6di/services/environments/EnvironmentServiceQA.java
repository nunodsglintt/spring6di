package guru.springframework.spring6di.services.environments;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("envService")
public class EnvironmentServiceQA implements EnvironmentService {
    @Override
    public String findEnvironment() {
        return "We're in the qa environment";
    }
}
