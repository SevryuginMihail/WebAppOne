package sevryugin.spring.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

//    private Music music;
//
//    private MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public void playMusic() {
//        System.out.println("Playing :" + music.getSong());
//    }

    private ClassicalMusic classicalMusic;
    private  RockMusic rockMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
    public void playMusic(){
        System.out.println(classicalMusic.getSong());
        System.out.println(rockMusic.getSong());
    }
}
