/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbilo
 */
public abstract class Animal {
    
    private int npatas;
    private String cor;

    public int getNpatas() {
        return npatas;
    }

    public void setNpatas(int npatas) {
        this.npatas = npatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void andar(){
        System.out.println("Animal andando");
    }
    
    public void falar(){
        System.out.println("Animal falando");

    }
    
    public void comer(){
        System.out.println("Animal comendo");
    }
}
