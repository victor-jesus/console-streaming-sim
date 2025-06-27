package model;

public abstract class Audio implements Streaming {
    private String title;
    private double duration;
    private String author;
    private int likes;
    private int visualizations;

    public Audio(String title, double duration, String author) {
        this.title = title;
        this.duration = duration;
        this.author = author;
    }

    public Audio(String title, double duration, String author, int likes, int visualizations) {
        this(title, duration, author);
        this.likes = likes;
        this.visualizations = visualizations;
    }

    @Override
    public void play() {
        this.visualizations++;
        System.out.println("⏹ Tocando " + this.title);
    }

    @Override
    public void pause() {
        System.out.println("⏸ Pausando " + this.title);
    }

    @Override
    public void like(){
        System.out.println("❤ Curtido");
        likes++;
    }

    @Override
    public void unlike(){
        System.out.println("\uD83D\uDC94 Descurtido");
        likes--;
    }

    @Override
    public void getDescription(){
        System.out.println(this.getTitle() + "\nCurtidas: " + this.getLikes() + "\nVezes escutada " + this.getVisualizations());
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public int getLikes() {
        return likes;
    }

    public int getVisualizations() {
        return visualizations;
    }

    public String getAuthor() {
        return author;
    }
}
