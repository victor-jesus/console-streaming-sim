package model;

public interface BibliotecaInterface {
    void add(Audio audio);
    void remove(Audio audio);
    void listAudios();
    Audio selectAudio(String title);
}
