package sevryugin.spring.music;

import lombok.Data;

/**
 * ClassicalMusic.
 *
 * @author Mihail_Sevryugin
 */
@Data
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Moon";
    }

//    @Override
    public void init() {
        System.out.println("Init ClassicalMusic bean");
    }

//    @Override

    public void destroy() {
        System.out.println("Destroy ClassicalMusic bean");
    }
}
