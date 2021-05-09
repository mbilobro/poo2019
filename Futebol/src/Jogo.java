
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

// @author Matheus Bilo
public class Jogo {

    //Atributos
    private Time desafiado;
    private Time desafiante;
    private String estadio;
    private boolean aprovado;

    //Getteres e Setteres
    public Time getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Time desafiado) {
        this.desafiado = desafiado;
    }

    public Time getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Time desafiante) {
        this.desafiante = desafiante;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public String getAprovadoTexto() {
        if (aprovado) {
            return ("Sim");
        } else {
            return ("Não");
        }
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    ArrayList<Jogo> listaJogos = new ArrayList<>();
    ArrayList<Time> listaTimes = new ArrayList<>();
    Scanner ler = new Scanner(System.in);
    private Random rand = new Random();

    //Funções e procedimentos
    public void cadastrarTime() {
        Time novoTime = new Time();

        System.out.println("Digite o nome do time: ");
        novoTime.setNome(ler.next());
        System.out.println("Digite o campeonato: ");
        novoTime.setCamp(ler.next());
        System.out.println("Digite o dinheiro em caixa: ");
        novoTime.setDinCaixa(ler.nextFloat());
        System.out.println("Digite o número de Brasileirões que o time venceu: ");
        novoTime.setBrasileirao(ler.nextFloat());
        System.out.println("Digite o número de Copas do Brasil que o time venceu: ");
        novoTime.setCopadobrasil(ler.nextFloat());
        System.out.println("Digite o número de Libertadores que o time venceu: ");
        novoTime.setLibertadores(ler.nextFloat());
        System.out.println("");
        if (novoTime.getDinCaixa() >= 250000) {
            novoTime.setDivisao(1);
        } else if (novoTime.getDinCaixa() > 50000) {
            novoTime.setDivisao(2);
        } else if (novoTime.getDinCaixa() <= 50000) {
            novoTime.setDivisao(3);
        }
        listaTimes.add(novoTime);
    }

    public void apresentar(int n) {
        for (Time t : listaTimes) {
            if (listaJogos.get(n).getDesafiante().getNome().equals(t.getNome())) {
                System.out.println(t);
            }
            if (listaJogos.get(n).getDesafiado().getNome().equals(t.getNome())) {
                System.out.println(t);
            }
        }
    }

    public void marcar_jogo() {
        Jogo novoJogo = new Jogo();
        int timedesafiante;
        int timedesafiado;
        System.out.println("------------Times cadastrados------------");
        for (int i = 0; i <= listaTimes.size() - 1; i++) {
            System.out.println("ID do Time: " + i + " - " + "Nome: " + listaTimes.get(i).getNome());
        }
        System.out.println("Digite o ID do time desafiante: ");
        timedesafiante = ler.nextInt();
        novoJogo.setDesafiante(listaTimes.get(timedesafiante));
        System.out.println("Digite o ID do time desafiado: ");
        timedesafiado = ler.nextInt();
        if (timedesafiante != timedesafiado) {
            novoJogo.setDesafiado(listaTimes.get(timedesafiado));
            System.out.println("Digite o estádio do jogo: ");
            novoJogo.setEstadio(ler.next());
            System.out.println("");
            novoJogo.setAprovado(false);
            listaJogos.add(novoJogo);
            System.out.println("Jogo marcado com sucesso entre: " + novoJogo.desafiante.getNome() + " x " + novoJogo.desafiado.getNome() + "\n"
                    + "Estádio: " + novoJogo.getEstadio() + "\n");
        } else {
            System.out.println("Você selecionou o mesmo time como desafiante e desafiado!!!\n");
        }
    }

    public void jogarAleatorio() {
        System.out.println("Estatísticas dos times que irão jogar!\n");
        int n = listaJogos.size() - 1;
        apresentar(n);
        System.out.println("");
        if (listaJogos.get(n).desafiante.getCamp().equals(listaJogos.get(n).desafiado.getCamp())) {
            if (listaJogos.get(n).desafiante.getDivisao() == listaJogos.get(n).desafiado.getDivisao()) {
                listaJogos.get(n).setAprovado(true);
                System.out.println("----------Iniciando partida----------");
                //se numeroAleatorio for 0 -> vitoria desafiante
                //se numeroAleatorio for 1 -> vitoria desafiado
                //se numeroAleatorio for 2 -> empate
                // int numeroAleatorio = 0;

                Integer numeroAleatorio = rand.nextInt(3);

                switch (numeroAleatorio) {
                    case 0:
                        listaJogos.get(n).desafiante.ganhar_jogo();
                        listaJogos.get(n).desafiado.perder_jogo();
                        System.out.println("O vencedor foi: " + listaJogos.get(n).desafiante.getNome() + "\n");
                        break;
                    case 1:
                        listaJogos.get(n).desafiante.perder_jogo();
                        listaJogos.get(n).desafiado.ganhar_jogo();
                        System.out.println("O vencedor foi: " + listaJogos.get(n).desafiado.getNome() + "\n");
                        break;
                    case 2:
                        listaJogos.get(n).desafiante.empatar_jogo();
                        listaJogos.get(n).desafiado.empatar_jogo();
                        System.out.println("Empate entre: " + listaJogos.get(n).desafiante.getNome() + " e " + listaJogos.get(n).desafiado.getNome() + "\n");
                        break;
                }
            } else {
                System.out.println("Os times não são da mesma divisão!!!\n");
            }
        } else {
            System.out.println("Os times não são do mesmo campeonato!!!\n");
        }
    }

    public void jogarIA() {
        System.out.println("Estatísticas dos times que irão jogar!\n");
        int n = listaJogos.size() - 1;
        float mediadesafiante = 0;
        float mediadesafiado = 0;
        apresentar(n);
        System.out.println("");
        if (listaJogos.get(n).desafiante.getCamp().equals(listaJogos.get(n).desafiado.getCamp())) {
            if (listaJogos.get(n).desafiante.getDivisao() == listaJogos.get(n).desafiado.getDivisao()) {
                listaJogos.get(n).setAprovado(true);
                System.out.println("----------Iniciando partida----------");

                mediadesafiante = listaJogos.get(n).desafiante.getMediaP();
                mediadesafiado = listaJogos.get(n).desafiado.getMediaP();

                if (mediadesafiante > mediadesafiado) {
                    listaJogos.get(n).desafiante.ganhar_jogo();
                    listaJogos.get(n).desafiado.perder_jogo();
                    System.out.println("O vencedor foi: " + listaJogos.get(n).desafiante.getNome() + "\n");
                } else if (mediadesafiado > mediadesafiante) {
                    listaJogos.get(n).desafiante.perder_jogo();
                    listaJogos.get(n).desafiado.ganhar_jogo();
                    System.out.println("O vencedor foi: " + listaJogos.get(n).desafiado.getNome() + "\n");
                } else {
                    listaJogos.get(n).desafiante.empatar_jogo();
                    listaJogos.get(n).desafiado.empatar_jogo();
                    System.out.println("Empate entre: " + listaJogos.get(n).desafiante.getNome() + " e " + listaJogos.get(n).desafiado.getNome() + "\n");
                }
            } else {
                System.out.println("Os times não são da mesma divisão!!!\n");
            }
        } else {
            System.out.println("Os times não são do mesmo campeonato!!!\n");
        }
    }

    public void jogos_realizados() {
        System.out.println("");
        System.out.println("------------Jogos realizados------------\n");
        for (Jogo j : listaJogos) {
            System.out.println(j.desafiante.getNome() + " x " + j.desafiado.getNome() + " - Aprovado: " + j.getAprovadoTexto() + "\n");
        }
    }

    public void status() {
        System.out.println("");
        System.out.println("------------Status dos times------------");
        for (Time t : listaTimes) {
            System.out.println("");
            System.out.println(t);
            System.out.println("-----------------------------------------\n");
        }
    }
}