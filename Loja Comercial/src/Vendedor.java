/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbilo
 */
public class Vendedor extends Funcionário {
    
    private float vendas;

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
    
    @Override
    public void gerar_salario_total() {
        if (getTipo().equals("V")) {
        setSalario_final(getSalario() + (getVendas() * 5 / 100));
        }
    }
    
    @Override
    public void imprimir(){
        if (getTipo().equals("V")) {
        System.out.println("Nome          : " + this.getNome());
        System.out.println("RG            : " + this.getRg());
        System.out.println("Tipo          : " + this.getTipoTexto());
        System.out.println("Salário       : " + this.getSalario());
        System.out.println("Vendas        : " + this.getVendas());
        System.out.println("Salário final : " + this.getSalario_final());
        System.out.println("------------------------------------");
        }
    }
}
