/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbilo
 */
public class Mamifero extends Animal {
    
    private boolean tempelo;

    public boolean getTempelo() {
        return tempelo;
    }

    public void setTempelo(boolean tempelo) {
        this.tempelo = tempelo;
    }
    
    @Override
    public void andar(){
        System.out.println("Mamífero andando");
    }
    
    @Override
    public void falar(){
        System.out.println("Mamífero falando");
    }
    
    @Override
    public void comer(){
        System.out.println("Mamífero comendo");
        
    }
    
}
