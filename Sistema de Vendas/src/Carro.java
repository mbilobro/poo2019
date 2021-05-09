 //@author MatheusBilo

public class Carro extends Veiculo {

    private int nportas;
    private String cambio;
    private boolean ar_cond;
    private boolean som;

    public int getNportas() {
        return nportas;
    }

    public void setNportas(int nportas) {
        this.nportas = nportas;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public boolean getAr_cond() {
        return ar_cond;
    }

    public void setAr_cond(boolean ar_cond) {
        this.ar_cond = ar_cond;
    }

    public boolean getSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }

    public String getAr_condTexto() {
        return (ar_cond == true ? "SIM" : "NÃO");
    }

    public String getSomTexto() {
        return (som == true ? "SIM" : "NÃO");
    }
}
