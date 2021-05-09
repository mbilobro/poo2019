
public class Panela {

    private String modelo;
    private String marca;
    private String tipo;
    private String cor;
    private float aderencia;
    private boolean tampada;
    private int npanela;

    public Panela() {
    }

    public Panela(String modelo, String marca, String tipo, String cor, float aderencia, boolean tampada, int npanela) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.cor = cor;
        this.aderencia = aderencia;
        this.tampada = tampada;
        this.npanela = npanela;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getAderencia() {
        return aderencia;
    }

    public void setAderencia(float aderencia) {
        this.aderencia = aderencia;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public int getNpanela() {
        return npanela;
    }

    public void setNpanela(int npanela) {
        this.npanela = npanela;
    }
    
    public void status() {
        System.out.println("Panela " + this.npanela);
        System.out.println("Modelo   : " + this.modelo);
        System.out.println("Marca    : " + this.marca);
        System.out.println("Tipo     : " + this.tipo);
        System.out.println("Cor      : " + this.cor);
        System.out.println("Aderência: " + this.aderencia);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("--------------------------------");
    }

    public void cozinhar() {
        if (tampada) {
            System.out.println("Esta cozinhando");
        } else {
            System.out.println("Não está cozinhando");
        }

    }

    public void tampar() {
        this.tampada = true;
    }

    private void destampar() {
        this.tampada = false;

    }

}
