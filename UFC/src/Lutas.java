
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

// @author MatheusBilo
public class Lutas {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    private Random rand = new Random();
    ArrayList<Lutador> listaLutadores = new ArrayList();
    ArrayList<Lutas> listaLutas = new ArrayList();
    Scanner ler = new Scanner(System.in);

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void cadastrar() {
        Lutador novoLutador = new Lutador();
        System.out.println("Insira o nome do lutador: ");
        novoLutador.setNome(ler.next());
        System.out.println("Insira a altura: ");
        novoLutador.setAltura(ler.nextFloat());
        System.out.println("Insira o peso: ");
        novoLutador.setPeso(ler.nextFloat());

        if (novoLutador.getPeso() >= 120) {
            novoLutador.setCategoria("Peso Pesado");
        } else if (novoLutador.getPeso() > 50) {
            novoLutador.setCategoria("Peso Leve");
        } else if (novoLutador.getPeso() <= 50) {
            novoLutador.setCategoria("Peso Galo");
        }
        listaLutadores.add(novoLutador);

    }

    public void marcar_luta() {
        Lutas novaLuta = new Lutas();
        int lutadordesafiante;
        int lutadordesafiado;
        System.out.println("Lutadores cadastrados");
        for (int i = 0; i <= listaLutadores.size() - 1; i++) {
            System.out.println("ID do Lutador: " + i + " - " + "Nome: " + listaLutadores.get(i).getNome());
        }
        System.out.println("Digite o ID do lutador desafiante: ");
        lutadordesafiante = ler.nextInt();
        novaLuta.setDesafiante(listaLutadores.get(lutadordesafiante));
        System.out.println("Digite o ID do lutador desafiado: ");
        lutadordesafiado = ler.nextInt();
        novaLuta.setDesafiado(listaLutadores.get(lutadordesafiado));

        if (lutadordesafiante != lutadordesafiado) {
            if (listaLutadores.get(lutadordesafiante).getCategoria().equals(listaLutadores.get(lutadordesafiado).getCategoria())) {
                novaLuta.setAprovada(false);
                listaLutas.add(novaLuta);
                System.out.println("Luta está marcada com sucesso entre: " + novaLuta.desafiante.getNome() + " X " + novaLuta.desafiado.getNome() + "\n");
            } else {
                System.out.println("Os lutadores não são da mesma categoria!!\n");
            }
        } else {
            System.out.println("Lutador desafiante e desafiado iguais!!\n");

        }
    }

    public void apresentar(int n) {
        for (Lutador l : listaLutadores) {
            if (listaLutas.get(n).getDesafiante().getNome().equals(l.getNome())) {
                System.out.println(l);
            }
            if (listaLutas.get(n).getDesafiado().getNome().equals(l.getNome())) {
                System.out.println(l);
            }
        }
    }

    public void lutar() {
        int n = listaLutas.size() - 1;
        if (listaLutas.get(n).desafiante.getCategoria().equals(listaLutas.get(n).desafiado.getCategoria())) {
            System.out.println("Estatísticas dos lutadores que irão lutar!\n");
            apresentar(n);
            System.out.println("");
            listaLutas.get(n).setAprovada(true);
            System.out.println("----------Iniciando luta----------");
            //se numeroAleatorio for 0 -> vitoria desafiante
            //se numeroAleatorio for 1 -> vitoria desafiado
            //se numeroAleatorio for 2 -> empate
            // int numeroAleatorio = 0;

            Integer numeroAleatorio = rand.nextInt(3);

            switch (numeroAleatorio) {
                case 0:
                    listaLutas.get(n).desafiante.ganhar_luta();
                    listaLutas.get(n).desafiado.perder_luta();
                    System.out.println("O vencedor foi: " + listaLutas.get(n).desafiante.getNome() + "\n");
                    break;
                case 1:
                    listaLutas.get(n).desafiante.perder_luta();
                    listaLutas.get(n).desafiado.ganhar_luta();
                    System.out.println("O vencedor foi: " + listaLutas.get(n).desafiado.getNome() + "\n");
                    break;
                case 2:
                    listaLutas.get(n).desafiante.empatar_luta();
                    listaLutas.get(n).desafiado.empatar_luta();
                    System.out.println("Empate entre: " + listaLutas.get(n).desafiante.getNome() + " e " + listaLutas.get(n).desafiado.getNome() + "\n");
                    break;
            }
        } else {
            System.out.println("Os lutadores não são da mesma categoria!!\n");
        }
    }

    public void lutas_realizadas() {
        System.out.println("");
        System.out.println("------------Lutas realizadas------------\n");
        for (Lutas l : listaLutas) {
            System.out.println(l.desafiante.getNome() + " X " + l.desafiado.getNome() + " - Aprovado: " + l.getAprovada() + "\n");
        }
    }

    public void status() {

        System.out.println("");
        System.out.println("Status dos lutadores");
        for (Lutador l : listaLutadores) {
            System.out.println("");
            System.out.println(l);
            System.out.println("-----------------------------------------\n");
        }
    }
}
