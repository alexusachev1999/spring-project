package ru.usachev.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private int volume;
    private String name;
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    public void playMusic(){
        musicList.forEach((n) -> System.out.println("Playing: "+n.getSong()));
    }


}
