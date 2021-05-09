/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistbanco2019;

/**
 *
 * @author voncarlos
 */
public class Conta {
    private int numConta;
    private String dono;
    private boolean statusConta;
    private String tipoConta;
    private float saldo;

    public Conta() {
        this.setStatusConta(false);
        this.setSaldo(0);
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "Dono: "+this.getDono()+
                    " NumConta: "+this.getNumConta()+" "
                + " Tipo: "+this.getTipoConta()+" "
                + "Saldo: "+this.getSaldo();
        return s; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
