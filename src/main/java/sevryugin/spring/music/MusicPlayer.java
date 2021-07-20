package sevryugin.spring.music;

import java.util.ArrayList;
import java.util.List;

/**
 * MusicPlayer.
 *
 * @author Mihail_Sevryugin
 */
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private Integer volume;

    public void init(){
        System.out.println("Init MusicPlayer");
    }

    public void destroy(){
        System.out.println("Destroy MusicPlayer");
    }

    public MusicPlayer() {

    }

    public MusicPlayer(List<Music> musicList, String name, Integer volume) {
        this.musicList = musicList;
        this.name = name;
        this.volume = volume;
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing : " + music.getSong());
        }
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
