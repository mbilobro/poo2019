public class Lutador {
    
    private String nome;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador() {
        this.altura = 0;
        this.peso = 0;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void ganhar_luta(){
        setVitorias(getVitorias() + 1);
    }
    
    public void perder_luta(){
        setDerrotas(getDerrotas() + 1);
    }
    
    public void empatar_luta(){
        setEmpates(getEmpates() + 1);
    }

    @Override
    public String toString() {
        return "Lutador\n" +
               "Nome      : " + nome + "\n" +
               "Altura    : " + altura +"\n" +
               "Peso      : " + peso + "\n" +
               "Categoria : " + categoria + "\n" +
               "Vitórias  : " + vitorias + "\n" +
               "Derrotas  : " + derrotas + "\n" +
               "Empates   : " + empates + "\n" ;
    }
}