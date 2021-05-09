/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbilo
 */
public class Administrativo extends Funcionário {

    private int horasExtras;

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public void gerar_salario_total() {
        float salario_hora = getSalario() / 220;
        if (getTipo().equals("A")) {
            setSalario_final(getSalario() + (salario_hora * getHorasExtras() * 1 / 100));
        }
    }

    @Override
    public void imprimir() {
        if (getTipo().equals("A")) {
            System.out.println("Nome          : " + this.getNome());
            System.out.println("RG            : " + this.getRg());
            System.out.println("Tipo          : " + this.getTipoTexto());
            System.out.println("Salário       : " + this.getSalario());
            System.out.println("Horas Extras  : " + this.getHorasExtras());
            System.out.println("Salário final : " + this.getSalario_final());
            System.out.println("------------------------------------");
        }
    }

}
