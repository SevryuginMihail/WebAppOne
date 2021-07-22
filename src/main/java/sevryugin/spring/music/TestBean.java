package sevryugin.spring.music;

/**
 * TestBean.
 *
 * @author Mihail_Sevryugin
 */
public class TestBean {
    private String value;

    public TestBean(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
