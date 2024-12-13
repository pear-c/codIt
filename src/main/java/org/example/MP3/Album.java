package org.example.MP3;

import java.util.ArrayList;

public class Album {
    private String title;
    private int year;
    private Artist artist;
    private ArrayList<Song> songs = new ArrayList<>();

    // 생성자
    public Album(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    // Getter
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }

    // 앨범에 트랙 추가(노래 추가)
    public void addTrack(Song song) {
        songs.add(song);
    }
    // 트랙 노래 리턴
    public Object getTrack(int i) {
        return songs.get(i-1);
    }
}
