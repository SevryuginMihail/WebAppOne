package sevryugin.spring.music;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * SpringConfig.
 *
 * @author Mihail_Sevryugin
 */
@Configuration
@ComponentScan("sevryugin.spring")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

//    @Bean
//    public ClassicalMusic classicalMusic(){
//        return new ClassicalMusic();
//    }
//
//    @Bean
//    public RockMusic rockMusic(){
//        return new RockMusic();
//    }
//
//    @Bean
//    public MusicPlayer musicPlayer(){
//        return new MusicPlayer(classicalMusic());
//    }
}
