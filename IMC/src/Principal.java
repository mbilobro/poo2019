
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

        Mulher m = new Mulher();
        Homem h = new Homem();
        Scanner ler = new Scanner(System.in);
        int escolha;
        String tipo;
        do {
            System.out.println("MENU\n1-Cadastrar\n2-Mostrar IMC's\n3-Mostrar parâmetros de comparação\n4-Sair");
            escolha = ler.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Você deseja cadastrar (H)omem / (M)ulher?");
                    tipo = ler.next();
                    if (tipo.equals("H")) {
                        h.cadastro();
                    } else if (tipo.equals("M")) {
                        m.cadastro();
                    } else {
                        System.out.println("Opção digitada inválida!\n");
                    }
                    break;
                case 2:
                    System.out.println("Você deseja mostrar o IMC de (H)omens / (M)ulheres / (A)mbos?");
                    tipo = ler.next();
                    if (tipo.equals("H")) {
                        h.resultIMC();
                    } else if (tipo.equals("M")) {
                        m.resultIMC();
                    } else if(tipo.equals("A")){
                        h.resultIMC();
                        m.resultIMC();
                    } else{
                        System.out.println("Opção digitada inválida!!\n");
                    }
                    break;
                case 3:
                    System.out.println("Parâmetros utilizado para comparar IMC nesse programa!\n");
                        h.parametrosIMC();
                        m.parametrosIMC();
            }
        } while (escolha != 4);
        System.out.println("Programa encerrado...\n");
    }
}