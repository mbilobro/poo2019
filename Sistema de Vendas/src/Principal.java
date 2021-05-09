 // @author MatheusBilo

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Vendas v = new Vendas();
        Scanner ler = new Scanner(System.in);
        int escolha;
        String opc;

        do {
            System.out.println("MENU\n1-Cadastrar veículos\n2-Visualizar estoque\n3-Efetuar Venda\n4-Relatório de Vendas\n5-Relatório de Lucros\n6-Sair\n");
            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    v.loadEstoque();
                    break;
                case 2:
                    System.out.println("Você deseja ver estoque de (C)arros (M)otos ou (A)mbos? ");
                    opc = ler.next();
                    if (opc.equals("C")) {
                        v.verEstoqueCarros();
                    } else if (opc.equals("M")) {
                        v.verEstoqueMotos();
                    } else {
                        v.verEstoqueCarros();
                        v.verEstoqueMotos();
                    }
                    break;
                case 3:
                    v.efetuar_venda();
                    break;
                case 4:
                    System.out.println("Você deseja verificar o relatório de vendas de (C)arros (M)otos ou (A)mbos? ");
                    opc = ler.next();
                    if (opc.equals("C")) {
                        v.relatorioVendaCarros();
                    } else if (opc.equals("M")) {
                        v.relatorioVendaMotos();
                    } else {
                        v.relatorioVendaCarros();
                        v.relatorioVendaMotos();
                    }
                    break;
                case 5:
                    System.out.println("Você deseja verificar os lucros de (C)arros (M)otos ou (T)otal? ");
                    opc = ler.next();
                    if (opc.equals("C")) {
                        v.mostrarLucroCarro();
                    } else if (opc.equals("M")) {
                        v.mostrarLucroMoto();
                    } else {
                        v.mostrarLucroTotal();
                    }
                    break;
            }
        } while (escolha != 6);
        System.out.println("Programa encerrado...\n");
    }
}
