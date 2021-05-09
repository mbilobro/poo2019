
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
        // TODO code application logic here

        double valorConta = 0.00;
        double valorPago = 0.00;

        Troco t = new Troco();

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor da conta (0,00): ");
        valorConta = ler.nextDouble();

        System.out.println("Informe o valor pago (0,00): ");
        valorPago = ler.nextDouble();

        System.out.println(t.calculaTroco(valorConta, valorPago));
    }

}
