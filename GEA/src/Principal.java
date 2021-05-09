
import java.util.Scanner;

// @author Matheus Bilo
public class Principal {

    public static void main(String[] args) {

        ControleContainer cc = new ControleContainer();
        Scanner ler = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("MENU\n1-Importar\n2-Exportar\n3-ExportarContainer\n4-Visualizar ArrayList\n5-Visualizar Pilha\n6-Sair");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    cc.Importar();
                    break;
                case 2:
                    cc.Exportar();
                    break;
                case 3:
                    cc.ExportarContainer();
                    break;
                case 4:
                    cc.VisualizarContainers();
                    break;
                case 5:
                    cc.VisualizarPilha();
                    break;
            }
        } while (escolha != 6);
        System.out.println("Programa encerrado...\n");
    }
}
