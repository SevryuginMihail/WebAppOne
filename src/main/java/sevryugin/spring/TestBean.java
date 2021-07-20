package sevryugin.spring;

import lombok.Data;

/**
 * TestBean.
 *
 * @author Mihail_Sevryugin
 */
@Data
public class TestBean {
    private String value;

    public TestBean(String value) {
        this.value = value;
    }
}
