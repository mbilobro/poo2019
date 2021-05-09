/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbilo
 */
public class Ave extends Animal {
    
    private boolean tembico;
    private boolean tempena;

    public boolean getTembico() {
        return tembico;
    }

    public void setTembico(boolean tembico) {
        this.tembico = tembico;
    }

    public boolean getTempena() {
        return tempena;
    }

    public void setTempena(boolean tempena) {
        this.tempena = tempena;
    }
    
    @Override
    public void andar(){
        System.out.println("Ave andando");
    }
    
    @Override
    public void falar(){
        System.out.println("Ave falando");
    }
    
    @Override
    public void comer(){
        System.out.println("Ave comendo");
        
    }
    
}
