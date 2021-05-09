
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Curso c = new Curso();
        Professor p = new Professor();
        Scanner ler = new Scanner(System.in);

        System.out.println("Nome do curso: ");
        c.setNome_curso(ler.next());
        System.out.println("Turno do curso: ");
        c.setTurno(ler.next());
        System.out.println("");
        System.out.println("Nome do Professor: ");
        p.setNome_prof(ler.next());
        System.out.println("Departamento: ");
        p.setDepartamento(ler.next());
        System.out.println("Email: ");
        p.setEmail(ler.next());

        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

        int tam = 5;
        
        for (int i = 0; i < tam; i++) {
            Aluno a = new Aluno();
            System.out.println("Nome do Aluno: ");
            a.setNome_aluno(ler.next());
            System.out.println("Matrícula: ");
            a.setMatricula(ler.next());
            System.out.println("Nota 1: ");
            a.setNota1(ler.nextFloat());
            System.out.println("Nota 2: ");
            a.setNota2(ler.nextFloat());
            System.out.println("Nota 3: ");
            a.setNota3(ler.nextFloat());
            System.out.println("Nota 4: ");
            a.setNota4(ler.nextFloat());
            a.setMedia((a.getNota1() + a.getNota2() + a.getNota3() + a.getNota4()) / 4);
            listaAlunos.add(a);
        }
        c.setAlunos(listaAlunos);

        System.out.println("");
        System.out.println("Curso/Turno: " + c.getNome_curso() + "/" + c.getTurno());
        System.out.println("Professor/Departamento/Email: " + p.getNome_prof() + "/" + p.getDepartamento() + "/" + p.getEmail());
        float soma = 0;
        for (Aluno a : c.getAlunos()) {
            System.out.println("Nome: " + a.getNome_aluno() + "\n" + "Matrícula: " + a.getMatricula() + "\n "
                    + "Notas: " + a.getNota1() + " / " + a.getNota2() + " / " + a.getNota3()
                    + " / " + a.getNota4() + "\n" + "Média: " + a.getMedia());
            soma += a.getMedia();

            if (a.getMedia() >= 7) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado");
            }
        }
        System.out.println("Média da turma: " + soma / c.getAlunos().size());
    }

}
