package sevryugin.spring.music;

import lombok.Data;

/**
 * RockMusic.
 *
 * @author Mihail_Sevryugin
 */
@Data
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "eeee Roock";
    }

//    @Override
    public void init() {
        System.out.println("Init RockMusic bean");
    }

//    @Override
    public void destroy() {
        System.out.println("Destroy RockMusic bean");
    }
}
