 //@author MatheusBilo
public class Pessoa {
    private String nome;
    private String datanascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome
              + "Data de nascimento: " + datanascimento ;
    }
}
