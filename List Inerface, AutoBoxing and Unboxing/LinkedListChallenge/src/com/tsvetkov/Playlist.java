package com.tsvetkov;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private String name;
    private LinkedList<Song> songLinkedList;

    private boolean movingForward;
    private ListIterator<Song> songIterator;

    public Playlist(String name) {
        this.name = name;
        this.songLinkedList = new LinkedList<Song>();
        this.movingForward = true;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song skipForward() {

        if(!movingForward) {
            if(songIterator.hasNext()) {
                songIterator.next();
            }
            movingForward = true;
        }

        if(songIterator.hasNext()) {
            Song song = songIterator.next();
            return song;
        } else {
            movingForward = false;
            return null;
        }
    }

    public Song skipBackward() {
        if(movingForward) {
            if(songIterator.hasPrevious()) {
                songIterator.previous();
            }
            movingForward = false;
        }

        if(songIterator.hasPrevious()) {
            Song song = songIterator.previous();
            return song;
        } else {
            movingForward = true;
            return null;
        }
    }

    public Song replayCurrentSong() {
        if((!movingForward || !songIterator.hasPrevious()) && songIterator.hasNext()) {
            songIterator.next();
            return songIterator.previous();
        }

        if(movingForward || !songIterator.hasNext()) {
            songIterator.previous();
            return songIterator.next();
        }

        return null; // we will never get here
    }

    public boolean isPlaylistEmpty() {
        if(songLinkedList.isEmpty()) {
            return true;
        }

        this.songIterator = this.songLinkedList.listIterator();
        return false;
    }

    public boolean addSong(String title, Album album) {
        Song song = album.findSong(title);
        if(song != null) {
            if(findSong(title) == null) {
               songLinkedList.add(song);
               return true;
            }
        }
        return false; // no such song in given album or song already in playlist
    }

    public void removeCurrentSong() {
        songIterator.remove();
        System.out.println("Current song removed");
    }

    public void printPlaylist() {
        ListIterator<Song> songIterator = songLinkedList.listIterator();

        if(songLinkedList.isEmpty()) {
            System.out.println("Playlist " + this.name + " is empty.");
            return;
        }

        while(songIterator.hasNext()) {
            Song song = songIterator.next();
            System.out.println("Song title: " + song.getTitle() +
                            ", Duration: " + song.getDuration());
        }
        System.out.println();
    }

    private Song findSong(String title) {
        ListIterator<Song> songIterator = songLinkedList.listIterator();

        while(songIterator.hasNext()) {
            Song song = songIterator.next();
            if(song.getTitle().equals(title)) {
                return song;
            }
        }

        return null;
    }


}
