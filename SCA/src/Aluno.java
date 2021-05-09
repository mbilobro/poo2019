public class Aluno {

    String nome;
    int idade;
    int ano;
    String curso;
    String periodo;

    public Aluno() {
    }

    public Aluno(String nome, int idade, int ano, String curso, String periodo) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        String s = "Aluno   : " + nome + "\n"
                +  "Idade   : " + idade + "\n"
                +  "Ano     : " + ano + "\n"
                +  "Curso   : " + curso + "\n"
                +  "Período : " + periodo + "\n";
        return s;
    }
}
