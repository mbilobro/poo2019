/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistbanco2019;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author voncarlos
 */
public class ControllerConta extends Conta{
    Scanner ler = new Scanner(System.in);
    ArrayList<Conta> listaContas = new ArrayList<Conta>();
    
    public void Cadastrar(){
        Conta instaciaConta = new Conta(); 
        System.out.println("Digite o numero da conta: ");
        instaciaConta.setNumConta(ler.nextInt());
        
        System.out.println("Digite o DONO: ");
        instaciaConta.setDono(ler.next());
        
        System.out.println("Digite tipo da conta: ");
        instaciaConta.setTipoConta(ler.next());
        
        listaContas.add(instaciaConta);
    }
    
    public void Depositar(){
        System.out.println("Qual o numero da conta para deposito: ");
        int numero  = ler.nextInt();
        System.out.println("Qual o valor do deposito: ");
        float valor  = ler.nextFloat();
        System.out.println("valor: "+valor);
        for(Conta cc:listaContas){
            if(cc.getNumConta() == numero){
                cc.setSaldo(cc.getSaldo()+valor);
            }
        }
    }
    
    public void Sacar(double v, int numConta){
        
    }
    
    public void Mostrar(){
        for(Conta a :listaContas){
            System.out.println(a);
        }
    }
}
