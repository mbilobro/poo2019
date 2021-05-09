/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mbilo
 */
public class Entrada {
    
   public double entrada;
   public String data;
   public String motivo;

    public Entrada() {
    }

    public Entrada(double entrada, String data, String motivo) {
        this.entrada = entrada;
        this.data = data;
        this.motivo = motivo;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
   
}
