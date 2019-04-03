package py.com.mechague;

/**
 * @author Marcos Echague
 * @since 30/03/2019
 */

public class HashEntry {

    private String key;
    private String value;
    protected HashEntry next;

    public HashEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
