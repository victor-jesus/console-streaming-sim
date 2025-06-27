package controller;

import model.Audio;
import model.BibliotecaInterface;

public class BibliotecaController {
    private BibliotecaInterface biblioteca;

    public BibliotecaController(BibliotecaInterface biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void add(Audio audio){
        biblioteca.add(audio);
    }

    public void remove(Audio audio){
        biblioteca.remove(audio);
    }

    public void listAudios(){
        biblioteca.listAudios();
    }

    public Audio selectAudio(String title){
        return biblioteca.selectAudio(title);
    }
}
