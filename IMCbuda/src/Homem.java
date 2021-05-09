
import java.util.ArrayList;
import java.util.Scanner;


// @author MatheusBilo
public class Homem extends PessoaIMC {
    Scanner ler = new Scanner(System.in);
    ArrayList <Homem> listaHomens = new ArrayList <> ();
    
    @Override
    public String toString() {
        return    "Nome: " + getNome() + "\n"
                + "Data de nascimento: " + getDatanascimento() + "\n"
                + "Altura: " + getAltura() + "\n"
                + "Peso: " + getPeso() + "\n";
    }

    @Override
    public void resultIMC() {
         for (Homem h : listaHomens) {
            System.out.println("");
            System.out.println(h);
            if(h.getIMC() > 26.4){
                System.out.println("IMC: " + h.getIMC() + " - " + "Acima do peso ideal!\n");
            } else if (h.getIMC() > 20.7 ){
                System.out.println("IMC: " + h.getIMC() + " - " + "Peso ideal!\n");
            } else if (h.getIMC() <= 20.7) {
                System.out.println("IMC: " + h.getIMC() + " - " + "Abaixo do peso ideal!\n");
            }
            System.out.println("-----------------------------------------\n");
        }
    }
    
    @Override
    public void cadastro(){
        Homem novoHomem = new Homem();
        System.out.println("Cadastro de homem");
        System.out.println("Insira o nome: ");
        novoHomem.setNome(ler.next());
        System.out.println("Insira a data de nascimento (dd/mm/aaaa): ");
        novoHomem.setDatanascimento(ler.next());
        System.out.println("Insira o peso em quilogramas: ");
        novoHomem.setPeso(ler.nextDouble());
        System.out.println("Insira a altura em metros (Exemplo: 1,60): ");
        novoHomem.setAltura(ler.nextDouble());
        novoHomem.calculaIMC();
        listaHomens.add(novoHomem);
        System.out.println("Cadastro realizado com sucesso!!\n");
    }
}