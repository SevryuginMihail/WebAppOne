package sevryugin.spring.music;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * RockMusic.
 *
 * @author Mihail_Sevryugin
 */
@Data
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "eeee Roock";
    }

    public void init() {
        System.out.println("Init RockMusic bean");
    }

    public void destroy() {
        System.out.println("Destroy RockMusic bean");
    }
}
