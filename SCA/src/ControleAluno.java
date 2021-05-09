
import java.util.ArrayList;
import java.util.Scanner;
public class ControleAluno extends Aluno {

    Scanner ler = new Scanner(System.in);
    ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    public void Cadastrar() {
        Aluno instaciaAluno = new Aluno();
        System.out.println("Qual o nome do aluno: ");
        instaciaAluno.setNome(ler.next());
        System.out.println("Qual idade: ");
        instaciaAluno.setIdade(ler.nextInt());
        System.out.println("Qual ano: ");
        instaciaAluno.setAno(ler.nextInt());
        System.out.println("Qual o curso: ");
        instaciaAluno.setCurso(ler.next());
        System.out.println("Qual o período: ");
        instaciaAluno.setPeriodo(ler.next());
        listaAlunos.add(instaciaAluno);
    }

    public void Remover() {
        System.out.println("Qual o nome do Aluno para remoção: ");
        String nome = ler.next();
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getNome().equals(nome)) {
                listaAlunos.remove(i);
            }
        }
    }

    public void ListarAlunos() {
        for (Aluno a : listaAlunos) {
            System.out.println(a);
        }
    }

    public void BuscarAluno() {
        System.out.println("Qual o nome do Aluno para busca: ");
        String nome = ler.next();
        for (int i = 0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getNome().equals(nome)) {
                System.out.println(listaAlunos.get(i));
            }
        }
    }

}
