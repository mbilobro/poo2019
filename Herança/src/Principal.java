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
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.setNome("Jenifer");
        prof1.setIdade(45);
        prof1.setAltura(165);
        prof1.setSexo("Feminino");
        prof1.setSalario(5000);
        prof1.imprimir();
        
        Aluno a1 = new Aluno();
        a1.setNome("Jorelson");
        a1.setIdade(22);
        a1.setAltura(175);
        a1.setSexo("Masculino");
        a1.imprimir();
        
        
    }
}
