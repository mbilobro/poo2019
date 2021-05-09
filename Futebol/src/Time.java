
public class Time {

    //Atributos
    private String nome;
    private String camp;
    private float dinCaixa;
    private int divisao;
    private int vitorias;
    private int derrotas;
    private int empates;
    private float brasileirao;
    private float copadobrasil;
    private float libertadores;

    //Constructors
    
    public Time() {
        this.dinCaixa = 0;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
        this.brasileirao = 0;
        this.copadobrasil = 0;
        this.libertadores = 0;
    }

    //Getteres e Setteres
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCamp() {
        return camp;
    }

    public void setCamp(String camp) {
        this.camp = camp;
    }

    public float getDinCaixa() {
        return dinCaixa;
    }

    public void setDinCaixa(float dinCaixa) {
        this.dinCaixa = dinCaixa;
    }

    public int getDivisao() {
        return divisao;
    }

    public void setDivisao(int divisao) {
        this.divisao = divisao;
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

    public float getBrasileirao() {
        return brasileirao;
    }

    public void setBrasileirao(float brasileirao) {
        this.brasileirao = brasileirao;
    }

    public float getCopadobrasil() {
        return copadobrasil;
    }

    public void setCopadobrasil(float copadobrasil) {
        this.copadobrasil = copadobrasil;
    }

    public float getLibertadores() {
        return libertadores;
    }

    public void setLibertadores(float libertadores) {
        this.libertadores = libertadores;
    }
    
    public float getMediaP() {
        return (((this.brasileirao * 1) + (this.copadobrasil * 2) + (this.libertadores * 3)) / 6);
    }

    //To String
    @Override
    public String toString() {
        String s = "Nome       : " + nome + "\n"
                + "Campeonato : " + camp + "\n"
                + divisao + "ª divisão \n"
                + "Vitórias: " + vitorias + " - Derrotas: " + derrotas + " - Empates: " + empates;
        return s;
    }

    //Procedimentos/Funções
    public void ganhar_jogo() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perder_jogo() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatar_jogo() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
