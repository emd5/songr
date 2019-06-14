package com.mahoneyliz.Java.Songr;


import javax.persistence.*;
import java.util.List;

/**
 * The Album Model Class
 */
@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songCount;
    long length;
    String imageUrl;

    @OneToMany(mappedBy="album")
    public List<Song> songs;

    public  Album(){ }

    public Album(String title, String artist, int songCount, long length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public long getId(){ return this.id; }

    public String getTitle() { return this.title; }

    public String getArtist() { return this.artist; }

    public int getSongCount() { return this.songCount; }

    public long getLength() { return this.length; }

    public String getImageUrl() { return this.imageUrl; }

    public List<Song> getSongs() { return this.songs; }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
