

 // @author MatheusBilo

abstract class PessoaIMC extends Pessoa {
    
    private double altura;
    private double peso;
    private double IMC;
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public void calculaIMC(){
        setIMC(getPeso() / (getAltura() * getAltura()));
    }
    
    public void resultIMC(){
        
    }
    
    public void cadastro(){
        
    }
    
    public void parametrosIMC(){
        
    }

    @Override
    public String toString() {
        return  "Nome: " + getNome()
              + "Data de nascimento: " + getDatanascimento()
              + "Altura: " + altura
              + "Peso: " + peso ;
    }
}
