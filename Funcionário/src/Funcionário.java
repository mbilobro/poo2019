
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

// @author Matheus Bilo
public class Funcionário {

    private String nome;
    private float salario;
    private String cargo;
    private boolean licença;
    private Date dataAdmissao;

    Scanner ler = new Scanner(System.in);
    ArrayList<Funcionário> listaFuncionários = new ArrayList<>();

    public Funcionário() {
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String Cargo) {
        this.cargo = Cargo;
    }

    public boolean getLicença() {
        return licença;
    }

    public void setLicença(boolean licença) {
        this.licença = licença;
    }

    public String getLicençaTexto() {
        if (licença) {
            return ("Sim");
        } else {
            return ("Não");
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return "Nome             : " + nome + "\n"
                + "Salário          : " + salario + "\n"
                + "Cargo            : " + cargo + "\n"
                + "Data de admissão : " + formato.format(dataAdmissao) + "\n"
                + "Está de licença  : " + getLicençaTexto() + "\n";
    }

    public void cadastrar() {
        try {
            String data;
            Funcionário novoFuncionário = new Funcionário();
            System.out.println("Digite o nome do Funcionário: ");
            novoFuncionário.setNome(ler.next());
            System.out.println("Digite o salário: ");
            novoFuncionário.setSalario(ler.nextFloat());
            System.out.println("Digite o cargo: ");
            novoFuncionário.setCargo(ler.next());
            novoFuncionário.setLicença(false);
            System.out.println("Data de Admissão: (dd/MM/aaaa)");
            data = ler.next();
            DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date dataFormatada = formato.parse(data);
            novoFuncionário.setDataAdmissao(dataFormatada);
            listaFuncionários.add(novoFuncionário);
        } catch (ParseException ex) {
            Logger.getLogger(Funcionário.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void aumentar_salario() {

        System.out.println("Nome do funcionário para aumentar o salário: ");
        String func = ler.next();
        for (int i = 0; i < listaFuncionários.size(); i++) {
            if (listaFuncionários.get(i).getNome().equals(func)) {
                System.out.println("Valor do aumento: ");
                float valor = ler.nextFloat();
                listaFuncionários.get(i).setSalario(listaFuncionários.get(i).getSalario() + valor);
                System.out.println("Novo salário:" + listaFuncionários.get(i).getSalario());
            } else {
                System.out.println("Funcionário não encontrado!!\n");
            }
        }
    }

    public void imprimir() {
        for (Funcionário f : listaFuncionários) {
            System.out.println(f);
            System.out.println("----------------------------------------");
        }
    }

    public void pedir_licença() {
        System.out.println("Nome do funcionário para pedir licença: ");
        String func = ler.next();
        for (int i = 0; i < listaFuncionários.size(); i++) {
            if (listaFuncionários.get(i).getNome().equals(func)) {
                if (!listaFuncionários.get(i).getLicença()) {
                    listaFuncionários.get(i).setLicença(true);
                    System.out.println("O funcionário entrou em licença!!\n");
                } else {
                    System.out.println("O funcionário já está em licença!!\n");
                }
            } else {
                System.out.println("Funcionário não encontrado!!\n");
            }
        }
    }

    public void voltar_licença() {
        System.out.println("Nome do funcionário para voltar da licença: ");
        String func = ler.next();
        for (int i = 0; i < listaFuncionários.size(); i++) {
            if (listaFuncionários.get(i).getNome().equals(func)) {
                if (listaFuncionários.get(i).getLicença()) {
                    listaFuncionários.get(i).setLicença(false);
                    System.out.println("O funcionário voltou de licença!!\n");
                } else {
                    System.out.println("O funcionário não está em licença!!\n");
                }
            } else {
                System.out.println("Funcionário não encontrado!!\n");
            }
        }
    }
}