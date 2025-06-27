package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements BibliotecaInterface {
    private List<Audio> audios = new ArrayList<>();
    int quantity;

    @Override
    public void add(Audio audio) {
        this.audios.add(audio);
        quantity++;
    }

    @Override
    public void remove(Audio audio) {
        // PARA IMPLEMENTAR
        this.audios.remove(audio);
    }

    @Override
    public void listAudios(){
        int count = 0;
        if(!audios.isEmpty()) {
            for (Audio audio : audios) {
                count++;
                System.out.println(count + " - " + audio.getTitle() + " --- " + audio.getAuthor());
            }
        } else {
            System.out.println("Biblioteca não contem itens.");
        }
    }

    @Override
    public Audio selectAudio(String title){
        for(Audio audio: audios){
            if(audio.getTitle().equalsIgnoreCase(title)){
                return audio;
            }
        }
        return null;
    }

    public int getQuantity() {
        return quantity;
    }
}

