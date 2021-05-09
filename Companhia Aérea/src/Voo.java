 // @author MatheusBilo
public class Voo extends CompanhiaAerea {
    
    private String numero;
    private String aeroOrigem;
    private String aeroDestino;
    private double distanciaKm;
    private double precoKm;
    private String tipo;
    private double passagem;
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAeroOrigem() {
        return aeroOrigem;
    }

    public void setAeroOrigem(String aeroOrigem) {
        this.aeroOrigem = aeroOrigem;
    }

    public String getAeroDestino() {
        return aeroDestino;
    }

    public void setAeroDestino(String aeroDestino) {
        this.aeroDestino = aeroDestino;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public double getPrecoKm() {
        return precoKm;
    }

    public void setPrecoKm(double precoKm) {
        this.precoKm = precoKm;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPassagem() {
        return passagem;
    }

    public void setPassagem(double passagem) {
        this.passagem = passagem;
    }
    
    
    
    public double calcularPassagem(){
        return 0;
    }
}
