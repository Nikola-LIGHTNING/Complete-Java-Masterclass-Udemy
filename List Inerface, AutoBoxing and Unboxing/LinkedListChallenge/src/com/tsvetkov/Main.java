package com.tsvetkov;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Playlist playlist = new Playlist("Nikola's playlist");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Album album = new Album("Niki");

        album.addSong("Kolio", "4:20");
        album.addSong("Gerka-Perka", "0:07");
        album.addSong("Sad", "0:03");
        album.addSong("Mat", "0:04");
        album.addSong("TryHarder", "0:17");
        album.printSongs();

        playlist.addSong("Kolio", album);
        playlist.addSong("Gerka-Perka", album);
        playlist.addSong("Sad", album);
        playlist.addSong("Mat", album);
        playlist.addSong("TryHarder", album);


        if(playlist.isPlaylistEmpty()) {
            System.out.println("There are no song in playlist " + playlist.getName());
        } else {
            playlistMenu();
        }

    }

    public static void playlistMenu() {
        int choice;
        boolean quit = false;

        printInstructions();

        Song song = playlist.skipForward();
        if(song != null) {
            System.out.println("Now playing " + song.getTitle() + ", " + song.getDuration());
        }


        while(!quit) {
            System.out.print("Enter input: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    song = playlist.skipForward();
                    if(song != null) {
                        System.out.println("Now playing " + song.getTitle() + ", " + song.getDuration());
                    } else {
                        System.out.println("No more songs forward!");
                    }
                    break;

                case 2:
                    song = playlist.skipBackward();
                    if(song != null) {
                        System.out.println("Now playing " + song.getTitle() + ", " + song.getDuration());
                    } else {
                        System.out.println("No more songs backward!");
                    }
                    break;

                case 3:
                    song = playlist.replayCurrentSong();
                    System.out.println("Now playing " + song.getTitle() + ", " + song.getDuration());
                    break;

                case 4:
                    playlist.removeCurrentSong();
                    break;

                case 5:
                    playlist.printPlaylist();
                    break;

                case 6:
                    printInstructions();
                    break;
            }

        }
    }


    public static void printInstructions() {
        System.out.println("Press");
        System.out.println("\t 0 - to quit\n" +
                "\t 1 - to play next song\n" +
                "\t 2 - to play previous song\n" +
                "\t 3 - to replay current song\n" +
                "\t 4 - to remove current song\n" +
                "\t 5 - to print playlist\n" +
                "\t 6 - to print instructions\n");
    }


}
