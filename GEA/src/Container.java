 // @author Matheus Bilo

public class Container {

    private int num_container;
    private String tipo;
    private int capacidade;

    public Container() {
        
    }

    public Container(int num_container, String tipo, int capacidade) {
        this.num_container = num_container;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public int getNum_container() {
        return num_container;
    }

    public void setNum_container(int num_container) {
        this.num_container = num_container;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        String s = "Container  : " + num_container + "\n" +
                   "Capacidade : " + capacidade + "\n" +
                   "Tipo       : " + tipo + "\n";
        return s;
    }
}
