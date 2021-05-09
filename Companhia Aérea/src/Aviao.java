 // @author MatheusBilo

public class Aviao extends Voo {
    
    private String marca;
    private String modelo;
    private int poltronas;
    private int piloto;
    private int poltronasVendidas = 0;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(int poltronas) {
        this.poltronas = poltronas;
    }

    public int getPiloto() {
        return piloto;
    }

    public void setPiloto(int piloto) {
        this.piloto = piloto;
    }

    public int getPoltronasVendidas() {
        return poltronasVendidas;
    }

    public void setPoltronasVendidas(int poltronasVendidas) {
        this.poltronasVendidas = poltronasVendidas;
    }
    
}
