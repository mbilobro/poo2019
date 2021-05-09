
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

// @author MatheusBilo
public class PessoaFisica extends Pessoa {
    
    private String cpf;
    private String sexo;
    private String passaporte;
    private Date datanascimento;
    
    Scanner ler = new Scanner(System.in);

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
}
