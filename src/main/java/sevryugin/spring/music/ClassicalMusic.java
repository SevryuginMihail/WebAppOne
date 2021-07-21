package sevryugin.spring.music;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * ClassicalMusic.
 *
 * @author Mihail_Sevryugin
 */
@Data
@Component
public class ClassicalMusic implements Music {
    public ClassicalMusic() {
    }// поменял обратно на public

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Moon";
    }

    public void init() {
        System.out.println("Init ClassicalMusic bean");
    }

    public void destroy() {
        System.out.println("Destroy ClassicalMusic bean");
    }
}
