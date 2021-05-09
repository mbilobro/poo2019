/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbilo
 */
public class Cao extends Mamifero{
    
    private boolean dono;
    private int hora;
    private int minuto;
    private String frase;
    private int idade;


    public boolean getDono() {
        return dono;
    }

    public void setDono(boolean dono) {
        this.dono = dono;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public void andar(){
        System.out.println("Cão andando");
    }
    
    @Override
    public void falar(){
        System.out.println("Cão falando");
    }
    
    @Override
    public void comer(){
        System.out.println("Cão comendo");
        
    }
    
    public void reagir(boolean dono){
        if(dono = true){
            System.out.println("Cachorro feliz");
        }else{
            System.out.println("Cachorro raiva");
        }
    }
    
    public void reagir(int hora, int minuto){
    if(hora >= 10 && minuto > 0){
        System.out.println("Cachorro feliz");
    } else{
        System.out.println("Cachorro sonolento");
    }
}
    
    public void reagir(int idade){
        if(idade < 10){
            System.out.println("Cachorro balançando o rabo");
        } else{
            System.out.println("Cachorro pouco feliz");
        }
    }
    
    public void reagir(String frase){
        if(frase.equals("Oi meu bebezinho lindo")){
            System.out.println("Cachorro muito feliz");
        } else{
            System.out.println("Cachorro feliz");
        }
    }
    
}
