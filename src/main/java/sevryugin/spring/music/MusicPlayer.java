package sevryugin.spring.music;

import com.sun.org.glassfish.gmbal.NameValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * MusicPlayer.
 *
 * @author Mihail_Sevryugin
 */
@Component
public class MusicPlayer {

    //    private List<Music> musicList = new ArrayList<>();
//    private String name;
//    private Integer volume;
//
//    public void init(){
//        System.out.println("Init MusicPlayer");
//    }
//
//    public void destroy(){
//        System.out.println("Destroy MusicPlayer");
//    }
//
//    public MusicPlayer() {
//
//    }
//
//    public MusicPlayer(List<Music> musicList, String name, Integer volume) {
//        this.musicList = musicList;
//        this.name = name;
//        this.volume = volume;
//    }
//
//    public void playMusic() {
//        for (Music music : musicList) {
//            System.out.println("Playing : " + music.getSong());
//        }
//    }
//
//    public List<Music> getMusicList() {
//        return musicList;
//    }
//
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getVolume() {
//        return volume;
//    }
//
//    public void setVolume(Integer volume) {
//        this.volume = volume;
//    }

// 11 урок
//    private Music music;
//    @Autowired
//    public MusicPlayer(@Qualifier("rockMusic") Music music) {
//        this.music = music;
//    }
//
//    public void playMusic() {
//        System.out.println("Playing :" + music.getSong());
//    }
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    //11 урок или раньше
    //    private ClassicalMusic classicalMusic;
//    private  RockMusic rockMusic;
//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }
//    public void playMusic(){
//        System.out.println(classicalMusic.getSong());
//        System.out.println(rockMusic.getSong());
//    }

    // задание к 11 уроку
//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music classicalMusic;
//    @Autowired
//    @Qualifier("rockMusic")
//    private Music rockMusic;
//
//    public void playMusic(){
//        System.out.println(classicalMusic.getSong());
//        System.out.println(rockMusic.getSong());
//    }
    // 12 урок @Scope, @Value, @PostConstruct, @PreDestroy

    // 12 lesson
    @Autowired
    @Qualifier("classicalMusic")
    private Music music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private Integer volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public MusicPlayer() {}

    public void init() {
        System.out.println("Init MusicPlayer");
    }

    public void destroy() {
        System.out.println("Destroy MusicPlayer");
    }

    public void playMusic() {
        System.out.println("Playing :" + music.getSong());
    }

    public Music getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
