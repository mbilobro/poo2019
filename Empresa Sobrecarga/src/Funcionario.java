/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbilo
 */
public class Funcionario {
    
    private String cpf;
    private String nivel;
    private int anosTrabalhados;
    private boolean sabeNivel;
    private double salario = 1000;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getAnosTrabalhados() {
        return anosTrabalhados;
    }

    public void setAnosTrabalhados(int anosTrabalhados) {
        this.anosTrabalhados = anosTrabalhados;
    }

    public boolean getSabeNivel() {
        return sabeNivel;
    }

    public void setSabeNivel(boolean sabeNivel) {
        this.sabeNivel = sabeNivel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calculaPL(String nivel){
        if(nivel.equals("ABC")){
            setSalario(salario * 5);
            setNivel(nivel);
            System.out.println("Seu nível é " + getNivel());
            System.out.println("Salário do funcionário é: " + getSalario());
        } else if(nivel.equals("DEF")){
            setSalario(salario * 3);
            setNivel(nivel);
            System.out.println("Seu nível é " + getNivel());
            System.out.println("Salário do funcionário é: " + getSalario());
        } else if(nivel.equals("GHI")){
            setSalario(salario * 2);
            setNivel(nivel);
            System.out.println("Seu nível é " + getNivel());
            System.out.println("Salário do funcionário é: " + getSalario());
        } else {
            System.out.println("Você inseriu um nível errado!");
        }
    }
    
    public void calculaPL(int anosTrabalhados){
        if (anosTrabalhados >= 30){
            setNivel("ABC");
            setSalario(salario * 5);
            System.out.println("Seu nível é " + getNivel());
            System.out.println("Salário do funcionário é: " + getSalario());
        } else if(anosTrabalhados >= 15){
            setNivel("DEF");
            setSalario(salario * 3);
            System.out.println("Seu nível é " + getNivel());
            System.out.println("Salário do funcionário é: " + getSalario());
        } else if(anosTrabalhados >= 5){
            setNivel("GHI");
            setSalario(salario * 2);
            System.out.println("Seu nível é " + getNivel());
            System.out.println("Salário do funcionário é: " + getSalario());
        } else{
            System.out.println("Você inseriu errado seus anos trabalhados!");
        }
    }
}