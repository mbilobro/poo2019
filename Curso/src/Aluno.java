public class Aluno {
    
    private String nome_aluno;
    private String matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float media;

    public Aluno() {
    }

    public Aluno(String nome_aluno, String matricula, float nota1, float nota2, float nota3, float nota4, float media) {
        this.nome_aluno = nome_aluno;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.media = media;
    }
    
    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    
}
