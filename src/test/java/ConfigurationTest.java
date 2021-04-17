import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ConfigurationTest {

    final WebTestExample config = ConfigFactory.create(WebTestExample.class, System.getProperties());

    @Test
    public void testConfiguration()  {
        System.out.println(config.getbrowserName());
        System.out.println(config.getbrowserVersion());
        System.out.println(config.getEnvironment());
    }
}
