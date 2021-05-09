 // @author MatheusBilo
public class Motos extends Veículos {
    
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void atribuirPreco() {
        if (getTipo().equals("Moto")) {
            if(getCilindradas() == 0){
                setCilindradas(125);
            }
            setImposto(3);
                setPreçoLocação((getCilindradas() / 2) + (getImposto() * getDiasLocação()));
                System.out.println("O preço do aluguel da moto total é: " + getPreçoLocação());
            }
        }
    
    @Override
    public void imprimir(){
        if (getTipo().equals("Moto")) {
        System.out.println("Tipo          : " + this.getTipo());
        System.out.println("Cor           : " + this.getCor());
        System.out.println("Placa         : " + this.getPlaca());
        System.out.println("Cilindradas   : " + this.getCilindradas());
        System.out.println("Aluguel total : " + this.getPreçoLocação());
        System.out.println("------------------------------------");
        }
    }
    }
