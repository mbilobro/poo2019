
import java.util.ArrayList;
import java.util.Scanner;

public class Fluxo {
    
    public double valor;

    
    Scanner ler = new Scanner(System.in);
    
    ArrayList<Fluxo> listaFluxo = new ArrayList<>();
    ArrayList<Entrada> listaEntradas = new ArrayList<>();
    ArrayList<Saida> listaSaidas = new ArrayList<>();
    
    
    public Fluxo() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void cadastrarEntrada(){
        Entrada novaEntrada = new Entrada();
            System.out.println("Digite o valor da entrada: ");
            novaEntrada.setEntrada(ler.nextDouble());
            System.out.println("Digite a data (DD/MM/AAAA): ");
            novaEntrada.setData(ler.next());
            System.out.println("Digite o motivo: ");
            novaEntrada.setMotivo(ler.next());
            setValor(getValor() + novaEntrada.getEntrada());
            listaEntradas.add(novaEntrada);
            
            System.out.println("Entrada cadastrada com sucesso!");
            System.out.println("Saldo: " + getValor() + "\n");
}
    
    public void cadastrarSaida(){
        Saida novaSaida = new Saida();
            System.out.println("Digite o valor da saída: ");
            novaSaida.setSaida(ler.nextDouble());
            System.out.println("Digite a data (DD/MM/AAAA): ");
            novaSaida.setData(ler.next());
            System.out.println("Digite o motivo: ");
            novaSaida.setMotivo(ler.next());
            setValor(getValor() - novaSaida.getSaida());
            listaSaidas.add(novaSaida);
            
            System.out.println("Saída cadastrada com sucesso!");
            System.out.println("Saldo: " + getValor() + "\n");
}
    
    public void mostrarEntradas(){
        System.out.println("");
        System.out.println("------------Lista de Entradas------------\n");
        for (Entrada e : listaEntradas) {
            System.out.println("Valor      : " + e.getEntrada());
            System.out.println("Data       : " + e.getData());
            System.out.println("Motivo     : " + e.getMotivo());
            System.out.println("-----------------------------------------");
            
        }
    }
    
    public void mostrarSaidas(){
        System.out.println("");
        System.out.println("------------Lista de Saidas------------\n");
        for (Saida s : listaSaidas) {
            System.out.println("Valor      : " + s.getSaida());
            System.out.println("Data       : " + s.getData());
            System.out.println("Motivo     : " + s.getMotivo());
            System.out.println("-----------------------------------------");
        }
    }
    
    public void mostrarSaldo(){
        
        if (getValor() > 0 ){
            System.out.println("O saldo da E²C está positivo em: R$ " + getValor());
            System.out.println("");
            
        } else if (getValor() == 0){
            System.out.println("O saldo da E²C está zerado: R$ " + getValor());
            System.out.println("");

        }else{
            System.out.println("O saldo da E²C está negativo em: R$ " + getValor());
            System.out.println("");
        }
        }
    }

