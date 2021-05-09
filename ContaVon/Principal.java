/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistbanco2019;

import java.util.Scanner;

/**
 *
 * @author voncarlos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControllerConta cc = new ControllerConta();
        Scanner ler = new Scanner(System.in);
        int escolha;
        
        do {           
            
            System.out.println("Digite 1:cadastro 2:listar 3:Depositar");
            escolha = ler.nextInt();
            
            switch(escolha){
                case 1:
                    cc.Cadastrar();
                break;
                case 2:
                    cc.Mostrar();
                break;
                case 3:
                    cc.Depositar();
                break;
            }
            
        } while (escolha != 5);
        
    }
    
}
