/*https://www.youtube.com/watch?v=MVbBLoZrT2A&list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&index=8*/
package sevryugin.spring.music;

import lombok.Data;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestMusic.
 *
 * @author Mihail_Sevryugin
 */
@Data
public class TestMusic {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music;
//        music = context.getBean("musicBean",Music.class);
//        System.out.println(music.getSong());
        // без листа в musicPlayer
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        // добавил лист в MusicPlayer
        // если заработает, будет чотко..
        // ..чотко
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        context.close();
        // Разбор scope : singleton and prototype
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        context.close();
        // Использование factory-method
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//        context.close();
        // Использование аннотации @Component
//        RockMusic rockMusic = context.getBean("rockMusic",RockMusic.class);
//        System.out.println(rockMusic.getSong());
//        context.close();
        // Использование аннотации @Autowired и @Component(MusicPlayer только с одним полем)
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        context.close();
//        Computer computer=context.getBean("computer",Computer.class);
//        System.out.println(computer.toString());
//        context.close();
        // @Qualifier - еще задание к 11 уроку
//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        System.out.println(musicPlayer.toString());
//        context.close();
        // Полностью ушли от XML
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = configApplicationContext.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.toString());
        configApplicationContext.close();
    }
}
