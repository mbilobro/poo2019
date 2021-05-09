
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Funcionário f = new Funcionário();
        Scanner ler = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\nMENU\n1-Cadastrar\n2-Aumentar salário\n3-Pedir Licença\n4-Voltar Licença\n5-Imprimir informações\n6-Sair\n");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    f.cadastrar();
                    break;
                case 2:
                    f.aumentar_salario();
                    break;
                case 3:
                    f.pedir_licença();
                    break;
                case 4:
                    f.voltar_licença();
                    break;
                case 5:
                    f.imprimir();
                    break;
            }
        } while (escolha != 6);
        System.out.println("Programa encerrado...\n");
    }
}
