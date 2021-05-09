
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastros {

    Scanner ler = new Scanner(System.in);
    ArrayList<Passageiro> listaPassageiros = new ArrayList<>();
    ArrayList<Aviao> listaAvioes = new ArrayList<>();
    ArrayList<Vendas> listaVendas = new ArrayList<>();

    public void cadastroPassageiro() {
        Passageiro novoPassageiro = new Passageiro();

        System.out.println("Digite o nome do passageiro: ");
        novoPassageiro.setNome(ler.next());
        System.out.println("Digite o email: ");
        novoPassageiro.setEmail(ler.next());
        System.out.println("Digite o número do CPF: ");
        novoPassageiro.setCpf(ler.next());
        System.out.println("Digite o sexo: ");
        novoPassageiro.setSexo(ler.next());
        System.out.println("Digite o número do passaporte: ");
        novoPassageiro.setPassaporte(ler.next());
        System.out.println("Digite o número do cartão fidelidade: ");
        novoPassageiro.setnFidelidade(ler.nextInt());
        System.out.println("Digite a categoria do cartão fidelidade(Bronze/Prata/Ouro): ");
        novoPassageiro.setCatFidelidade(ler.next());
        System.out.println("");
        listaPassageiros.add(novoPassageiro);
    }

    public void cadastroAviao() {
        int piloto;
        Aviao novoAviao = new Aviao();
        
        System.out.println("Dados da empresa");
        System.out.println("Digite o nome da empresa: ");
        novoAviao.setNome(ler.next());
        System.out.println("Digite o email: ");
        novoAviao.setEmail(ler.next());
        System.out.println("Digite o número do CNPJ: ");
        novoAviao.setCnpj(ler.next());
        System.out.println("Digite a área de atuação: ");
        novoAviao.setAtuacao(ler.next());
        System.out.println("Digite o número de autorização da ANAC: ");
        novoAviao.setnAutoAnac(ler.next());
        System.out.println("");
        System.out.println("Dados do Voo");
        System.out.println("Digite o número: ");
        novoAviao.setNumero(ler.next());
        System.out.println("Digite o aeroporto de origem: ");
        novoAviao.setAeroOrigem(ler.next());
        System.out.println("Digite o aeroporto de destino: ");
        novoAviao.setAeroDestino(ler.next());
        System.out.println("Digite a distância(KM): ");
        novoAviao.setDistanciaKm(ler.nextDouble());
        System.out.println("Digite o preço por KM: ");
        novoAviao.setPrecoKm(ler.nextDouble());
        System.out.println("Digite o tipo (Nacional/Internacional): ");
        novoAviao.setTipo(ler.next());
        System.out.println("");
        System.out.println("Dados do Avião");
        System.out.println("Digite a marca: ");
        novoAviao.setMarca(ler.next());
        System.out.println("Digite o modelo: ");
        novoAviao.setModelo(ler.next());
        System.out.println("Digite o número de poltronas: ");
        novoAviao.setPoltronas(ler.nextInt());
        System.out.println("");
        System.out.println("Digite o ID do piloto: ");
        for (int i = 0; i < listaPassageiros.size(); i++) {
            System.out.println("ID: " + i + " - " + listaPassageiros.get(i).getNome());
        }
        piloto = ler.nextInt();
        novoAviao.setPiloto(piloto);
        listaAvioes.add(novoAviao);
    }

    public void vendaPassagem() {
        int passageiro;
        int voo;
        Vendas novaVenda = new Vendas();
        System.out.println("Digite o ID do passageiro que quer realizar a compra: ");
        for (int i = 0; i < listaPassageiros.size(); i++) {
            System.out.println("ID: " + i + " - " + listaPassageiros.get(i).getNome());
        }
        passageiro = ler.nextInt();
        System.out.println("Escolha o ID do voo: ");
        for (int i = 0; i < listaAvioes.size(); i++) {
            System.out.println("ID: " + i + " - " + listaAvioes.get(i).getNumero());
        }
        voo = ler.nextInt();
        listaAvioes.get(voo).setPoltronasVendidas(listaAvioes.get(voo).getPoltronasVendidas() + 1);
        calcularPrecoPassagem(passageiro, voo);
        novaVenda.setPassageiro(passageiro);
        novaVenda.setAviao(voo);
        novaVenda.setPrecoPassagem(listaAvioes.get(voo).getPassagem());

        listaVendas.add(novaVenda);
    }

    public void calcularPrecoPassagem(int passageiro, int voo) {
        double desconto;
        double acrescimo;
        if (listaAvioes.get(voo).getTipo().equals("Nacional")) {
            desconto = (0.20 * listaAvioes.get(voo).getPoltronasVendidas());
            listaAvioes.get(voo).setPassagem(listaAvioes.get(voo).getDistanciaKm() * listaAvioes.get(voo).getPrecoKm() - desconto);
        } else {
            acrescimo = (0.20 * (listaAvioes.get(voo).getPoltronas() - listaAvioes.get(voo).getPoltronasVendidas()));
            listaAvioes.get(voo).setPassagem(listaAvioes.get(voo).getDistanciaKm() * listaAvioes.get(voo).getPrecoKm() + acrescimo);
        }
    }
    
    public void mostrarVendas(){
        for(Vendas v : listaVendas){
            int posicaopas = v.getPassageiro();
            int posicaovoo = v.getAviao();
            
            System.out.println("Passageiro: " + listaPassageiros.get(posicaopas).getNome());
            System.out.println("Avião: " + listaAvioes.get(posicaovoo).getNumero());
            System.out.println("Preço Passagem: " + v.getPrecoPassagem());
        }
    }
    
}
