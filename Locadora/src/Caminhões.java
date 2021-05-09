 // @author MatheusBilo
public class Caminhões extends Veículos {

    private int eixos;

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    @Override
    public void atribuirPreco() {
        if (getTipo().equals("Caminhões")) {
            setImposto(10);
                setPreçoLocação((getEixos() * 100 ) + (getImposto() * getDiasLocação()));
                System.out.println("O preço do aluguel do caminhão total: " + getPreçoLocação());
            }
        }
    
    @Override
    public void imprimir(){
        if (getTipo().equals("Caminhões")) {
        System.out.println("Tipo          : " + this.getTipo());
        System.out.println("Cor           : " + this.getCor());
        System.out.println("Placa         : " + this.getPlaca());
        System.out.println("Eixos         : " + this.getEixos());
        System.out.println("Aluguel total : " + this.getPreçoLocação());
        System.out.println("------------------------------------");
        }
    }
}
