
import java.util.ArrayList;
import java.util.Scanner;

//author Matheus Bilo 
public class ControleContainer extends Container {

    public ArrayList<Container> listaContainers = new ArrayList<>();
    Scanner ler = new Scanner(System.in);
    Pilha p = new Pilha();

    public ControleContainer() {

    }

    public void Importar() {
        Container novoContainer = new Container();
        System.out.println("Digite o número do container: ");
        novoContainer.setNum_container(ler.nextInt());
        System.out.println("Tipo (I)solado, (R)efrigerado, (A)utomóvel): ");
        novoContainer.setTipo(ler.next());
        System.out.println("Capacidade (20/25): ");
        novoContainer.setCapacidade(ler.nextInt());
        listaContainers.add(novoContainer);
        p.Push(novoContainer);
    }

    public void Exportar() {
        int posicao = p.posicaoPilha;
        p.Pop();
        System.out.println("Ultimo container removido da pilha");
        listaContainers.remove(posicao);
    }

    public void ExportarContainer() {
        System.out.println("Qual o número do Container para exportação (ArrayList): ");
        int numero = ler.nextInt();
        for (int i = 0; i < listaContainers.size(); i++) {
            if (listaContainers.get(i).getNum_container() == numero) {
                listaContainers.remove(i);
            }
        }
    }

    public void VisualizarContainers() {
        for (Container c : listaContainers) {
            System.out.println(c);
        }
    }

    public void VisualizarPilha() {
        for (int i = p.posicaoPilha; i >= 0; i--) {
            System.out.println(p.pilha[i].toString());
        }

    }

}
