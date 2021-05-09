
import java.util.ArrayList;

public class Pilha extends Container {

    public ArrayList<Container> listaContainers = new ArrayList<>();

    public Object[] pilha;
    public int posicaoPilha;
    public int tam = 12;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[tam];
    }

    public boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public boolean Push(Container c) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = c;
            System.out.println("Container empilhado na posição " + posicaoPilha);
            View();
            return true;
        }
        return false;
    }

    public Object Pop() {
        if (pilhaVazia()) {
            return false;
        }
        return this.pilha[posicaoPilha--];
    }

    public void View() {
        System.out.println("Posição pilha " + posicaoPilha + "\n" + pilha[posicaoPilha]);
    }

}
