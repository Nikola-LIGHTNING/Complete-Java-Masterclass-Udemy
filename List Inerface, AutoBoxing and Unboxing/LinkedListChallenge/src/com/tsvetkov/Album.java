package com.tsvetkov;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> album;

    public Album(String name) {
        this.name = name;
        this.album = new ArrayList<Song>();
    }

    public boolean addSong(String title, String duration) {
        if(findSong(title) != null) {
            System.out.println("Song " + title + " is already in album "  + this.name + "\n");
            return false;
        }

        album.add(new Song(title, duration));
        System.out.println("Song " + title + " has been added to album " + this.name + "\n");
        return true;
    }

    public boolean removeSong(String title) {
        Song song = findSong(title);
        if(song != null) {
            album.remove(song);
            System.out.println("Song " + title + " has been removed from album " + this.name + "\n");
            return true;
        }

        System.out.println("Song " + title + " is not in album " + this.name + "\n");
        return false;
    }

    public void printSongs() {
        if(!album.isEmpty()) {
            for(int i = 0; i < album.size(); i++) {
                Song song = album.get(i);
                System.out.println((i + 1) + ". " + song.getTitle() + ", Duration: " + song.getDuration());
            }
            System.out.println();
        } else {
            System.out.println("There are no song in album " + this.name + '\n');
        }
    }

    public Song findSong(String title) {
        for(int i = 0; i < album.size(); i++) {
            Song song = album.get(i);
            if(song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }


}
