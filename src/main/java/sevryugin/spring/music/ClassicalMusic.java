package sevryugin.spring.music;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ClassicalMusic.
 *
 * @author Mihail_Sevryugin
 */
@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    public ClassicalMusic() {}// поменял обратно на public

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Moon";
    }

    @PostConstruct
    public void init(){
        System.out.println("init ClassicalMusic");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy ClassicalMusic");
    }
}
