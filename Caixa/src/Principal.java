
import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Fluxo f = new Fluxo();
        Scanner ler = new Scanner(System.in);
        int escolha;
        String opc;

        do {
            System.out.println("MENU\n1-Cadastrar Entrada\n2-Cadastrar Saída\n3-Vizualizar Entradas\n4-Vizualizar Saídas\n5-Mostrar saldo\n6-Sair\n");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    f.cadastrarEntrada();
                    break;
                case 2:
                    f.cadastrarSaida();
                    break;
                case 3:
                    f.mostrarEntradas();
                    break;
                case 4:
                    f.mostrarSaidas();
                    break;
                case 5:
                    f.mostrarSaldo();
                    break;
            }
        } while (escolha != 6);
        System.out.println("Programa encerrado...\n");
    }
    }

