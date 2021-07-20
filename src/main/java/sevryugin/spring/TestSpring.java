package sevryugin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestSpring.
 *
 * @author Mihail_Sevryugin
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getValue());

        context.close();
    }
}
