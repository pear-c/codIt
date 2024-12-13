package org.example.MP3;

import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Album> albums = new ArrayList<>();

    // 생성자
    public Artist(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    // 앨범 추가 메소드
    public void addAlbum(Album album) {
        albums.add(album);
    }
}
