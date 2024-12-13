package org.example.MP3;

public class Song {
    private String songName;
    private Artist artist;
    private Album album;

    // 생성자
    public Song(String songName, Artist artist, Album album) {
        this.songName = songName;
        this.artist = artist;
        this.album = album;
    }

    // toString()
    @Override
    public String toString() {
        return songName + " - " +
                artist.getName() + "\n" +
                album.getTitle() +
                "(" + album.getYear() + ")";
    }
}
