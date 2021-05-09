
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Time t = new Time();
        Jogo j = new Jogo();
        Scanner ler = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("MENU\n1-Cadastrar time\n2-Marcar jogo\n3-Jogar Aleatório\n4-Jogar com IA\n5-Jogos realizados\n6-Status times\n7-Sair\n");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    j.cadastrarTime();
                    break;
                case 2:
                    j.marcar_jogo();
                    break;
                case 3:
                    j.jogarAleatorio();
                    break;
                case 4:
                    j.jogarIA();
                    break;
                case 5:
                    j.jogos_realizados();
                    break;
                case 6:
                    j.status();
                    break;
            }
        } while (escolha != 7);
        System.out.println("Programa encerrado...\n");
    }
}
