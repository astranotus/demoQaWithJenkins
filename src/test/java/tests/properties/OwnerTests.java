package tests.properties;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class OwnerTests {
    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    @Test
    void someTest() {
        String login = config.login();
        String password = config.password();

        System.out.println("Login " + login);
        System.out.println("Password " + password);
    }
}
