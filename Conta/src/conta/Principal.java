package conta;

public class Principal {

    public static void main(String[] args) {
        Conta c2 = new Conta();
        c2.abrir_conta("CC");
        c2.setNum_conta("00002-2");
        c2.setDono("José Bilobrovec");
        c2.consulta();
        c2.depositar(800);
        c2.sacar(350);
        c2.consulta();
        c2.pagar_mensalidade();
        c2.consulta();
        c2.fechar_conta();
        c2.consulta();
    }
}
