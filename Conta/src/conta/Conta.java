package conta;

public class Conta {

    public String num_conta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public Conta(String num_conta, String tipo, String dono, double saldo, boolean status) {
        this.num_conta = num_conta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void consulta() {
        System.out.println("Número da conta : " + this.num_conta);
        System.out.println("Tipo            : " + this.tipo);
        System.out.println("Dono            : " + this.dono);
        System.out.println("Saldo           : " + this.saldo);
        System.out.println("Status          : " + this.status);
        System.out.println("------------------------------------");
    }

    public void abrir_conta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if (this.tipo == "CC") {
            setSaldo(50.00);
        } else {
            setSaldo(200.00);
        }
    }

    public void sacar(double valorSaque) {
        if (getStatus() && getSaldo() > 0 && valorSaque <= this.getSaldo()) {
            this.setSaldo(getSaldo() - valorSaque);
        } else {
            System.out.println("Saldo insuficiente para realizar essa operação!");
        }
    }

    public void depositar(double valorDeposito) {
        if (getStatus()) {
            this.setSaldo(getSaldo() + valorDeposito);
        } else {
            System.out.println("Conta fechada");
        }
    }

    public void fechar_conta() {
        if (getStatus()) {
            this.setSaldo(0);
            this.setStatus(false);
        }
    }

    public void pagar_mensalidade() {
        if (getStatus()) {
            if (this.getTipo() == "CC") {
                this.saldo = this.saldo - 50;
            } else {
                this.saldo = this.saldo - 30;
            }
            if (getSaldo() < 0) {
                System.out.println("Você está com a conta negativa!");
            }
        } else {
            System.out.println("Conta fechada");
        }
    }

}
