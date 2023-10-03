package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.environments.EnvironmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"QA", "EN"})
@SpringBootTest
public class EnvironmentControllerDevTest {
    @Autowired
    private EnvironmentService environmentService;
    @Test
    void findEnvironment() {

        System.out.println(environmentService.findEnvironment());
    }
}


