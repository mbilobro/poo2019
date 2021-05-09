/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbilo
 */
abstract class Funcionário {
    
    private String nome;
    private String rg;
    private float salario;
    private String tipo;
    private float salario_final;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSalario_final() {
        return salario_final;
    }

    public void setSalario_final(float salario_final) {
        this.salario_final = salario_final;
    }
    
    public String getTipoTexto(){
        if(getTipo().equals("V")){
            return "Vendedor";
        } else {
            return "Administrativo";
        }
    }
    
    public void gerar_salario_total(){
        
    }
    
    public void imprimir(){
        
    }
}
