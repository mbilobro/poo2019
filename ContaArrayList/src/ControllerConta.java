
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

    public void mostrar() {
        for (Conta a : listaContas) {
            System.out.println(a);
        }
    }

    public void depositar() {
        System.out.println("Número da conta para depósito: ");
        int numero = ler.nextInt();
        System.out.println("Valor do depósito: ");
        float valor = ler.nextFloat();
        System.out.println("Valor depositado: " + valor);
        for (Conta c : listaContas) {
            if (c.getNum_conta() == numero) {
                c.setSaldo(c.getSaldo() + valor);
            }
        }
    }

    public void sacar() {
        System.out.println("Número da conta para saque: ");
        int numero = ler.nextInt();
        System.out.println("Valor do saque: ");
        float valor = ler.nextFloat();
        System.out.println("Valor sacado: " + valor);
        for (Conta c : listaContas) {
            if (c.getNum_conta() == numero) {
                if (c.getSaldo() - valor >= 0) {
                    c.setSaldo(c.getSaldo() - valor);
                }
            }
        }
    }

    /* @Override
    public void abrir_conta() {
        setStatus(true);
        if (this.tipo == "CC") {
            setSaldo(50);
        } else {
            setSaldo(200);
        }
    }
     */
    public void fechar_conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void pagar_mensalidade() {
        System.out.println("Número da conta para pagamento: ");
        int numero = ler.nextInt();
        System.out.println("Valor da mensalidade: ");
        float valor = ler.nextFloat();
        System.out.println("Valor pago: " + valor);
        for (Conta c : listaContas) {
            if (c.getNum_conta() == numero) {
                c.setSaldo(c.getSaldo() - valor);
            }
        }
    }
}
