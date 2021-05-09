 // @author MatheusBilo

abstract class Veículos {

    private String tipo;
    private String cor;
    private String placa;
    private float imposto;
    private int diasLocação;
    private float preçoLocação;

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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public int getDiasLocação() {
        return diasLocação;
    }

    public void setDiasLocação(int diasLocação) {
        this.diasLocação = diasLocação;
    }

    public float getPreçoLocação() {
        return preçoLocação;
    }

    public void setPreçoLocação(float preçoLocação) {
        this.preçoLocação = preçoLocação;
    }

    public void atribuirPreco() {
    }
    
    public void imprimir(){
        
    }

}
