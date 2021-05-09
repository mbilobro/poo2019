import java.util.Scanner;
 // @author MatheusBilo

public class Principal {
    public static void main(String[] args) {
        
        Lutas lutas = new Lutas();
        Scanner ler = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("MENU\n1-Cadastrar lutador\n2-Marcar luta\n3-Lutar\n4-Lutas realizadas \n5-Status lutadores \n6-Sair\n");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    lutas.cadastrar();
                    break;
                case 2:
                    lutas.marcar_luta();
                    break;
                case 3:
                    lutas.lutar();
                    break;
                case 4:
                    lutas.lutas_realizadas();
                    break;
                case 5:
                    lutas.status();
                    break;
            }
        } while (escolha != 6);
        System.out.println("Programa encerrado...\n");
    }
}
