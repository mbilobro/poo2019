/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbilo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("João da Silva");
        v.setRg("11.146.700-5");
        v.setTipo("V");
        v.setSalario(2500);
        v.setVendas(8000);
        v.gerar_salario_total();
        v.imprimir();
        
        Administrativo a = new Administrativo();
        a.setNome("Kleide Batista");
        a.setRg("9.278.755-9");
        a.setTipo("A");
        a.setSalario(8000);
        a.setHorasExtras(24);
        a.gerar_salario_total();
        a.imprimir();
    }
    
}
