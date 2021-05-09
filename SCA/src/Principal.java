
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        ControleAluno ca = new ControleAluno();
        Scanner ler = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("Digite\n 1:Cadastrar Aluno\n 2:Remover Aluno\n 3:Listar Alunos\n 4:Buscar Aluno\n 5:Sair\n");
            escolha = ler.nextInt();
            switch (escolha) {
                case 1:
                    ca.Cadastrar();
                    break;
                case 2:
                    ca.Remover();
                    break;
                case 3:
                    ca.ListarAlunos();
                    break;
                case 4:
                    ca.BuscarAluno();
                    break;
            }
        } while (escolha != 5);
    }
}
