
import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    private String nome_curso;
    private String turno;
    private Professor professor;
    List<Aluno> alunos = new ArrayList();

    public Curso() {
    }

    public Curso(String nome_curso, String turno, Professor professor) {
        this.nome_curso = nome_curso;
        this.turno = turno;
        this.professor = professor;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

}
