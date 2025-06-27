package view;

import controller.AudioController;
import controller.BibliotecaController;
import model.Audio;
import model.Biblioteca;
import model.Music;
import model.MusicGenre;

import java.util.Scanner;

public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);
    private Biblioteca biblioteca = new Biblioteca();
    private AudioController controller = new AudioController();
    private BibliotecaController bibliotecaController = new BibliotecaController(biblioteca);

    public void showMenu(){
        int option;
        int option2;
        String audioName;

        Music audio = new Music("Patience", 5, "Guns'n Roses", MusicGenre.ROCK);
        Music audio2 = new Music("Sweet", 6, "Guns'n Roses", MusicGenre.ROCK);

        bibliotecaController.add(audio);
        bibliotecaController.add(audio2);

            do {
                System.out.println("0 - Sair\n1 - Executar");
                option = scanner.nextInt();

                if(option == 0){
                    break;
                }

                bibliotecaController.listAudios();

                System.out.println("\n--- Menu ---");
                System.out.print("Digite o audio que deseja reproduzir: ");

                audioName = scanner.next();

                Audio selectedAudio = bibliotecaController.selectAudio(audioName);

                if (selectedAudio != null) {
                    do {
                        System.out.println("Você selecionou - " + selectedAudio.getTitle());
                        System.out.println("1 - Reproduzir");
                        System.out.println("2 - Pausar");
                        System.out.println("3 - Curtir");
                        System.out.println("4 - Ver detalhes");
                        System.out.println("0 - Sair");
                        System.out.print("Escolha: ");
                        option2 = scanner.nextInt();

                        controller.setAudio(selectedAudio);

                        switch (option2) {
                            case 1 -> controller.play();
                            case 2 -> controller.pause();
                            case 3 -> controller.like();
                            case 4 -> controller.getDescription();
                            case 0 -> System.out.println("Saindo da conta...");
                            default -> System.out.println("Opção invalida.");
                        }
                    } while (option2 != 0);
                } else {
                    System.out.println("Audio não encontrado.");
                }
            } while (option != 0);

    }
}
