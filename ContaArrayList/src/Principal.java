
import java.util.ArrayList;
import java.util.Scanner;

// @author mbilo
public class Principal {

    public static void main(String[] args) {
        ControllerConta cc = new ControllerConta();
        Scanner ler = new Scanner(System.in);
        int escolha;
        
        do {
            System.out.println("MENU\n1-Cadastrar\n2-Depositar\n3-Sacar\n4-Mostrar\n5-Pagar Mensalidade\n6-Sair");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    cc.cadastrar();
                    break;
                case 2:
                    cc.depositar();
                    break;
                case 3:
                    cc.sacar();
                    break;
                case 4:
                    cc.mostrar();
                    break;
                case 5:
                    cc.pagar_mensalidade();
                    break;
            }
        } while (escolha != 6);
        System.out.println("Programa encerrado...\n");
    }
}
