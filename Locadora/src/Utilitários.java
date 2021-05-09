 // @author MatheusBilo
public class Utilitários extends Veículos {
    
    private int passageiros;

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
    
    @Override
    public void atribuirPreco() {
        if (getTipo().equals("Utilitários")) {
            setImposto(7);
                setPreçoLocação((getPassageiros() * 75 ) + (getImposto() * getDiasLocação()));
                System.out.println("O preço do aluguel do utilitário por dia é: " + getPreçoLocação());
            }
        }
    @Override
    public void imprimir(){
        if (getTipo().equals("Utilitários")) {
        System.out.println("Tipo          : " + this.getTipo());
        System.out.println("Cor           : " + this.getCor());
        System.out.println("Placa         : " + this.getPlaca());
        System.out.println("Passageiros   : " + this.getPassageiros());
        System.out.println("Aluguel total : " + this.getPreçoLocação());
        System.out.println("------------------------------------");
        }
    }
}
