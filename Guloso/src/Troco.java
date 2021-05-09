
import java.text.DecimalFormat;

public class Troco {

    public String calculaTroco(double conta, double pago) {
        DecimalFormat formatador = new DecimalFormat("###,##0.00");  //Usar duas casas decimais
        if (pago < conta) {  //Verificar se o valor pago é suficiente
            return ("\nPagamento insuficiente, faltam R$ " + formatador.format(conta - pago) + "\n");
        } else {

            String resultado; //Variavel que mostra distribuição das notas
            double troco;

            troco = pago - conta;
            resultado = "\nTroco = R$ " + formatador.format(troco) + "\n\n";

            resultado = this.calculaNotas(troco, resultado);  //Chamada função Notas
            resultado = this.calculaMoedas(troco, resultado); //Chamada função Moedas

            resultado = resultado + "\n";

            return (resultado);
        }
    }

    private String calculaNotas( double troco, String resultado) {

        int nota[] = {100, 50, 20, 10, 5, 2, 1};  //Vetor com as cédulas disponíveis

        int valor;  //Parte inteira do troco
        int ct;     //Quantidade de determinada nota

        int contadorNota = 0;

        valor = (int) troco; //Pega a parte inteira do troco
        while (valor != 0) {
            ct = valor / nota[contadorNota]; // calculando a qtde de notas
            if (ct != 0) {
                resultado = resultado + (ct + " nota(s) de R$ " + nota[contadorNota] + "\n");
                valor = valor % nota[contadorNota]; // Resto
            }
            contadorNota++; // próxima nota
        }
        return resultado;
    }

    private String calculaMoedas(double troco, String resultado) {

        int centavos[] = {50, 25, 10, 5, 1};  //Vetor que armazena moedas disponíveis

        int contadorMoeda = 0;
        int valor;
        int ct;

        valor = (int) Math.round((troco - (int) troco) * 100);
        while (valor != 0) {
            ct = valor / centavos[contadorMoeda]; // calculando a qtde de moedas
            if (ct != 0) {
                resultado = resultado + (ct + " moeda(s) de " + centavos[contadorMoeda] + " centavo(s)\n");
                valor = valor % centavos[contadorMoeda]; // resto
            }
            contadorMoeda++; // próximo centavo
        }
        return resultado;
    }
}