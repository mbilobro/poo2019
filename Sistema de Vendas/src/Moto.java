 // @author MatheusBilo

public class Moto extends Veiculo {

    private boolean porta_objetos;
    private boolean carenagem;

    public boolean getPorta_objetos() {
        return porta_objetos;
    }

    public void setPorta_objetos(boolean porta_objetos) {
        this.porta_objetos = porta_objetos;
    }

    public boolean getCarenagem() {
        return carenagem;
    }

    public void setCarenagem(boolean carenagem) {
        this.carenagem = carenagem;
    }

    public String getPorta_ObjetosTexto() {
        return (porta_objetos == true ? "SIM" : "NÃO");
    }

    public String getCarenagemTexto() {
        return (carenagem == true ? "SIM" : "NÃO");
    }
}
