public class Professor {

    private String nome_prof;
    private String departamento;
    private String email;

    public Professor() {
    }

    public Professor(String nome_prof, String departamento, String email) {
        this.nome_prof = nome_prof;
        this.departamento = departamento;
        this.email = email;
    }
    
    public String getNome_prof() {
        return nome_prof;
    }

    public void setNome_prof(String nome_prof) {
        this.nome_prof = nome_prof;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
