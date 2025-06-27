package controller;

import model.Streaming;

public class AudioController {
    private Streaming streaming;

    public void setAudio(Streaming streaming){
        this.streaming = streaming;
    }

    public void play() {
        streaming.play();
    }

    public void pause() {
        streaming.pause();
    }

    public void like(){
        streaming.like();
    }

    public void unlike(){
        streaming.unlike();
    }

    public void getDescription(){
        System.out.println("Mostrando descrição...");
        streaming.getDescription();
    }
}
