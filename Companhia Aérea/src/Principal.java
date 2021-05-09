
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mbilo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cadastros c = new Cadastros();
        Scanner ler = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("MENU\n1-Cadastrar passageiro\n2-Cadastrar voo\n3-Comprar passagem\n4-Verificar vendas\n5-Sair\n");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    c.cadastroPassageiro();
                    break;
                case 2:
                    c.cadastroAviao();
                    break;
                case 3:
                    c.vendaPassagem();
                    break;
                case 4:
                    c.mostrarVendas();
                    break;
            }
        } while (escolha != 5);
        System.out.println("Programa encerrado...\n");
    }
}
