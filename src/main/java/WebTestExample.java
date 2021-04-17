import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}.properties"})

public interface WebTestExample extends Config {

    @Key("browserName")
    String getbrowserName();

    @Key("browserVersion")
    String getbrowserVersion();

    @Key("environment")
    String getEnvironment();
}
