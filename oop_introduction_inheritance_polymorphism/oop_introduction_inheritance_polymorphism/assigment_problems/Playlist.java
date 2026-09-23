package oop_introduction_inheritance_polymorphism.assigment_problems;

import java.util.Arrays;

public class Playlist {

    static class SongPlaylist {

        private String[] songs;
        private int songCount;

        public SongPlaylist(int maximumSize) {
            songs = new String[maximumSize];
            songCount = 0;
        }

        public void addSong(String song) {
            if (songCount < songs.length) {
                songs[songCount] = song;
                songCount++;
            }
        }

        public String[] getSongs() {
            return Arrays.copyOf(songs, songCount);
        }

        public int getSongCount() {
            return songCount;
        }
    }

    public static void main(String[] args) {

        SongPlaylist p = new SongPlaylist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();

        System.out.println("Songs before modification:");
        System.out.println(Arrays.toString(p.getSongs()));

        copy[0] = "Hacked";

        System.out.println("Modified copy:");
        System.out.println(Arrays.toString(copy));

        System.out.println("Actual playlist:");
        System.out.println(Arrays.toString(p.getSongs()));

        System.out.println("Song count: " + p.getSongCount());
    }
}