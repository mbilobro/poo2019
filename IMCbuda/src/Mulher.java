
import java.util.ArrayList;
import java.util.Scanner;

// @author MatheusBilo
public class Mulher extends PessoaIMC {

    Scanner ler = new Scanner(System.in);
    ArrayList<Mulher> listaMulheres = new ArrayList<>();

    @Override
    public String toString() {
        return    "Nome: " + getNome() + "\n"
                + "Data de nascimento: " + getDatanascimento() + "\n"
                + "Altura: " + getAltura() + "\n"
                + "Peso: " + getPeso();
    }

    @Override
    public void resultIMC() {
        for (Mulher m : listaMulheres) {
            System.out.println("");
            System.out.println(m);
            if(m.getIMC() > 25.8){
                System.out.println("IMC: " + m.getIMC() + " - " + "Acima do peso ideal!\n");
            } else if (m.getIMC() > 19 ){
                System.out.println("IMC: " + m.getIMC() + " - " + "Peso ideal!\n");
            } else if (m.getIMC() <= 19) {
                System.out.println("IMC: " + m.getIMC() + " - " + "Abaixo do peso ideal!\n");
            }
            System.out.println("-----------------------------------------\n");
        }
    }

    @Override
    public void cadastro() {
        Mulher novaMulher = new Mulher();
        System.out.println("Cadastro de mulher");
        System.out.println("Insira o nome: ");
        novaMulher.setNome(ler.next());
        System.out.println("Insira a data de nascimento (dd/mm/aaaa): ");
        novaMulher.setDatanascimento(ler.next());
        System.out.println("Insira o peso em quilogramas: ");
        novaMulher.setPeso(ler.nextDouble());
        System.out.println("Insira a altura em metros (Exemplo: 1,60): ");
        novaMulher.setAltura(ler.nextDouble());
        novaMulher.calculaIMC();
        listaMulheres.add(novaMulher);
        System.out.println("Cadastro realizado com sucesso!!\n");
    }
}
