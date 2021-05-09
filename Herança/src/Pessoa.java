 // @author MatheusBilo
abstract class Pessoa {
    
    private String nome;
    private int idade;
    private float altura;
    private String sexo;

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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void fazer_aniver(){
        setIdade(getIdade() + 1);
        System.out.println("Parabéns" + getNome() + ", pelo seu " + getIdade() + "º aniversário, muitas felicidades!!!");
    }
    
    public void imprimir() {
        System.out.println("Nome   : " + this.nome);
        System.out.println("Idade  : " + this.idade);
        System.out.println("Altura : " + this.altura);
        System.out.println("Sexo   : " + this.sexo);
        System.out.println("------------------------------------");
    }

    @Override
    public String toString() {
        return "Nome   : " + nome +
               "Idade  :" + idade + 
               "Altura :" + altura +
               "Sexo   :" + sexo ;
    }
}
