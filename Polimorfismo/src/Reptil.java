/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbilo
 */
public class Reptil extends Animal {
    
    private boolean trocapele;

    public boolean getTrocapele() {
        return trocapele;
    }

    public void setTrocapele(boolean trocapele) {
        this.trocapele = trocapele;
    }
    
    @Override
    public void andar(){
        System.out.println("Réptil andando");
        
    }
    
    @Override
    public void falar(){
        System.out.println("Réptil falando");
        
    }
    
    @Override
    public void comer(){
        System.out.println("Réptil comendo");
        
    }
    
}
