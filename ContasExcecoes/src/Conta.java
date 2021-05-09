public class Conta {

    private int num_conta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {

    }

    public Conta(double saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }

    public Conta(int num_conta, String tipo, String dono, float saldo, boolean status) {
        this.num_conta = num_conta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String s = "Dono     : " + this.getDono() + "\n"
                +  "NumConta : " + this.getNum_conta() + "\n"
                +  "Tipo     : " + this.getTipo() + "\n"
                +  "Saldo    : " + this.getSaldo() + "\n";
        return s;
    }
}
