imort java.util.*;
public final class Configuration {
    private final String key;
    private final String value;
    public Configuration(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() { return key; }
    public String getValue() { return value; }
}
