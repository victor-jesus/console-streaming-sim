package model;

public class Music extends Audio {
    private MusicGenre musicGenre;

    public Music(String name, double duration, String author, MusicGenre musicGenre) {
        super(name, duration, author);
        this.musicGenre = musicGenre;
    }

}
