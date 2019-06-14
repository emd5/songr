package com.mahoneyliz.Java.Songr;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public long id;
    public String title;
    public int length;
    public int trackNumber;

    //(cascade = {CascadeType.ALL})
    @ManyToOne
    Album album;

    public Song(){}

    public Song(String title, int length, int trackNumber, Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album=album;
    }

    public long getId(){ return id; }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public Album getAlbum() { return album; }

    public void setTitle(String title) { this.title = title; }

    public void setLength(int length) { this.length = length; }

    public void setTrackNumber(int trackNumber) { this.trackNumber = trackNumber; }

    public void setAlbum(Album album) { this.album = album; }
}
