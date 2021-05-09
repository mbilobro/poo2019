import java.util.ArrayList;
import java.util.Scanner;

public class ControllerConta extends Conta {

    Scanner ler = new Scanner(System.in);
    ArrayList<Conta> listaContas = new ArrayList<Conta>();

    public void cadastrar() {
        Conta novaConta = new Conta();
        System.out.println("Digite o número da conta: ");
        novaConta.setNum_conta(ler.nextInt());
        System.out.println("Digite o nome: ");
        novaConta.setDono(ler.next());
        System.out.println("Escolha CC/CP: ");
        novaConta.setTipo(ler.next());
        novaConta.setStatus(true);
        if (novaConta.getTipo().equals("CC")) {
            novaConta.setSaldo(50);
        } else {
            novaConta.setSaldo(200);
        }
        listaContas.add(novaConta);
    }
    
}