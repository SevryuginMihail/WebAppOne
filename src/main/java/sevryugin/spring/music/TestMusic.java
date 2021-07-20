package sevryugin.spring.music;

import lombok.Data;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestMusic.
 *
 * @author Mihail_Sevryugin
 */
@Data
public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

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
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        context.close();
    }
}
