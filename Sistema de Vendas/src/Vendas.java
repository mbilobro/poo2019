import java.util.ArrayList;
import java.util.Scanner;

// @author MatheusBilo
public class Vendas {

    private double lucroCarro;
    private double lucroMoto;
    private double lucroTotal;

    public double getLucroCarro() {
        return lucroCarro;
    }

    public void setLucroCarro(double lucroCarro) {
        this.lucroCarro = lucroCarro;
    }

    public double getLucroMoto() {
        return lucroMoto;
    }

    public void setLucroMoto(double lucroMoto) {
        this.lucroMoto = lucroMoto;
    }

    public double getLucroTotal() {
        return lucroTotal;
    }

    public void setLucroTotal(double lucroTotal) {
        this.lucroTotal = lucroTotal;
    }

    ArrayList<Carro> listaCarros = new ArrayList<>();
    ArrayList<Moto> listaMotos = new ArrayList<>();

    Scanner ler = new Scanner(System.in);

    public void loadEstoque() {
        String tipo;
        System.out.println("Você deseja cadastrar um (C)arro ou uma (M)oto? ");
        tipo = ler.next();

        if (tipo.equals("C")) {
            Carro novoCarro = new Carro();
            System.out.println("Digite o número do chassi: ");
            novoCarro.setChassi(ler.nextInt());
            System.out.println("Digite o preço: ");
            novoCarro.setPreco(ler.nextDouble());
            System.out.println("Digite a marca: ");
            novoCarro.setMarca(ler.next());
            System.out.println("Digite o modelo: ");
            novoCarro.setModelo(ler.next());
            System.out.println("Digite a cor: ");
            novoCarro.setCor(ler.next());
            System.out.println("Digite o número de portas: ");
            novoCarro.setNportas(ler.nextInt());
            System.out.println("Digite o tipo do câmbio (Manual ou Automático): ");
            novoCarro.setCambio(ler.next());
            System.out.println("Tem ar condicionado? (true or false): ");
            novoCarro.setAr_cond(ler.nextBoolean());
            System.out.println("Tem som automotivo? (true or false): ");
            novoCarro.setSom(ler.nextBoolean());
            novoCarro.setVendido(false);
            listaCarros.add(novoCarro);

        } else {
            Moto novaMoto = new Moto();
            System.out.println("Digite o número do chassi: ");
            novaMoto.setChassi(ler.nextInt());
            System.out.println("Digite o preço: ");
            novaMoto.setPreco(ler.nextDouble());
            System.out.println("Digite a marca: ");
            novaMoto.setMarca(ler.next());
            System.out.println("Digite o modelo: ");
            novaMoto.setModelo(ler.next());
            System.out.println("Digite a cor: ");
            novaMoto.setCor(ler.next());
            System.out.println("Tem carenagem? (true or false): ");
            novaMoto.setCarenagem(ler.nextBoolean());
            System.out.println("Tem porta objetos? (true or false): ");
            novaMoto.setPorta_objetos(ler.nextBoolean());
            novaMoto.setVendido(false);
            listaMotos.add(novaMoto);
        }
    }

    public void verEstoqueCarros() {
        System.out.println("");
        System.out.println("------------Estoque de Carros------------\n");
        for (Carro c : listaCarros) {
            if(!c.getVendido())
            System.out.println("Chassi     : " + c.getChassi());
            System.out.println("Preço      : " + c.getPreco());
            System.out.println("Marca      : " + c.getMarca());
            System.out.println("Modelo     : " + c.getModelo());
            System.out.println("Cor        : " + c.getCor());
            System.out.println("Portas     : " + c.getNportas());
            System.out.println("Câmbio     : " + c.getCambio());
            System.out.println("Ar         : " + c.getAr_condTexto());
            System.out.println("Som        : " + c.getSomTexto());
            System.out.println("------------------------------------");
        }
    }

    public void verEstoqueMotos() {
        System.out.println("");
        System.out.println("------------Estoque de Motos------------\n");
        for (Moto m : listaMotos) {
            if(!m.getVendido())
            System.out.println("Chassi     : " + m.getChassi());
            System.out.println("Preço      : " + m.getPreco());
            System.out.println("Marca      : " + m.getMarca());
            System.out.println("Modelo     : " + m.getModelo());
            System.out.println("Cor        : " + m.getCor());
            System.out.println("PortaObj   : " + m.getPorta_ObjetosTexto());
            System.out.println("Carenagem  : " + m.getCarenagemTexto());
            System.out.println("------------------------------------");
        }
    }

    public void efetuar_venda() {
        int num_chassi;
        String opc;
        System.out.println("Você deseja vender (C)arro ou (M)oto? ");
        opc = ler.next();
        if (opc.equals("C")) {
            System.out.println("");
            System.out.println("------------Carros disponíveis para venda------------\n");
            for (Carro c : listaCarros) {
                if (!c.getVendido()) {
                    System.out.println("Chassi     : " + c.getChassi());
                    System.out.println("Preço      : " + c.getPreco());
                    System.out.println("Marca      : " + c.getMarca());
                    System.out.println("Modelo     : " + c.getModelo());
                    System.out.println("Cor        : " + c.getCor());
                    System.out.println("Portas     : " + c.getNportas());
                    System.out.println("Câmbio     : " + c.getCambio());
                    System.out.println("Ar         : " + c.getAr_condTexto());
                    System.out.println("Som        : " + c.getSomTexto());
                    System.out.println("------------------------------------");
                }
            }
            System.out.println("Insira o chassi do carro que será vendido: ");
            num_chassi = ler.nextInt();
            for (Carro c : listaCarros) {
                if (c.getChassi() == num_chassi) {
                    c.setVendido(true);
                    setLucroCarro(getLucroCarro() + c.getPreco());
                }
            }
        } else {
            System.out.println("");
            System.out.println("------------Motos disponíveis para venda------------\n");
            for (Moto m : listaMotos) {
                System.out.println("Chassi     : " + m.getChassi());
                System.out.println("Preço      : " + m.getPreco());
                System.out.println("Marca      : " + m.getMarca());
                System.out.println("Modelo     : " + m.getModelo());
                System.out.println("Cor        : " + m.getCor());
                System.out.println("PortaObj   : " + m.getPorta_ObjetosTexto());
                System.out.println("Carenagem  : " + m.getCarenagemTexto());
                System.out.println("------------------------------------");
            }

            System.out.println("Insira o chassi da moto que será vendida: ");
            num_chassi = ler.nextInt();
            for (Moto m : listaMotos) {
                if (m.getChassi() == num_chassi) {
                    m.setVendido(true);
                    setLucroMoto(getLucroMoto() + m.getPreco());
                }
            }
        }
    }

    public void relatorioVendaCarros() {
        System.out.println("");
        System.out.println("------------Relatório Vendas Carros------------\n");
        for (Carro c : listaCarros) {
            if (c.getVendido()) {
                System.out.println("Chassi     : " + c.getChassi());
                System.out.println("Preço      : " + c.getPreco());
                System.out.println("Marca      : " + c.getMarca());
                System.out.println("Modelo     : " + c.getModelo());
                System.out.println("Cor        : " + c.getCor());
                System.out.println("Portas     : " + c.getNportas());
                System.out.println("Câmbio     : " + c.getCambio());
                System.out.println("Ar         : " + c.getAr_condTexto());
                System.out.println("Som        : " + c.getSomTexto());
                System.out.println("------------------------------------");
            }
        }
    }

    public void relatorioVendaMotos() {
        System.out.println("");
        System.out.println("------------Relatório Vendas Motos------------\n");
        for (Moto m : listaMotos) {
            if (m.getVendido()) {
                System.out.println("Chassi     : " + m.getChassi());
                System.out.println("Preço      : " + m.getPreco());
                System.out.println("Marca      : " + m.getMarca());
                System.out.println("Modelo     : " + m.getModelo());
                System.out.println("Cor        : " + m.getCor());
                System.out.println("PortaObj   : " + m.getPorta_ObjetosTexto());
                System.out.println("Carenagem  : " + m.getCarenagemTexto());
                System.out.println("------------------------------------");
            }
        }
    }

    public void mostrarLucroCarro() {
        System.out.println("");
        System.out.println("----------Lucro Carro----------");
        System.out.println("R$ " + getLucroCarro());
    }

    public void mostrarLucroMoto() {
        System.out.println("");
        System.out.println("----------Lucro Moto----------");
        System.out.println("R$ " + getLucroMoto());
    }

    public void mostrarLucroTotal() {
        setLucroTotal(getLucroCarro() + getLucroMoto());
        System.out.println("");
        System.out.println("----------Lucro Total----------");
        System.out.println("R$ " + getLucroTotal());
    }
}