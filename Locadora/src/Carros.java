 // @author MatheusBilo

public class Carros extends Veículos {

    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void atribuirPreco() {
        if (getTipo().equals("Carro")) {
            setImposto(5);
            if(getCategoria().equals("A")){
                setPreçoLocação((getDiasLocação() * 1000) + (getImposto() * getDiasLocação()));
                System.out.println("O preço do aluguel do carro total é: " + getPreçoLocação());
            } else if(getCategoria().equals("B")){
                setPreçoLocação((getDiasLocação() * 500) + getImposto() * getDiasLocação());
                System.out.println("O preço do aluguel do carro total é: " + getPreçoLocação());
                
            } else if(getCategoria().equals("C")){
                setPreçoLocação((getDiasLocação() * 250) + getImposto() * getDiasLocação());
                System.out.println("O preço do aluguel do carro total é: " + getPreçoLocação());
            }
        }
    }
    
    @Override
    public void imprimir(){
        if (getTipo().equals("Carro")) {
        System.out.println("Tipo          : " + this.getTipo());
        System.out.println("Cor           : " + this.getCor());
        System.out.println("Placa         : " + this.getPlaca());
        System.out.println("Categoria     : " + this.getCategoria());
        System.out.println("Aluguel total : " + this.getPreçoLocação());
        System.out.println("------------------------------------");
        }
    }
}
