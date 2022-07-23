package estruturasDeControle;

import java.util.Scanner;

public class diaDaSemana {
    public static void main(String[] args) {

        // Digite o entrada da semana e o programa retorne o numero

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o entrada da semana: ");
        String diaDaSemana = entrada.next();

        // if("domingo".equalsIgnoreCase(diaDaSemana) - outra maneira
        if( diaDaSemana.equalsIgnoreCase("domingo")){
            System.out.println("É o primeiro dia da semana.");
        } else if ( diaDaSemana.equalsIgnoreCase("Segunda")) {
            System.out.println("É o segundo dia da semana.");
        } else if ( diaDaSemana.equalsIgnoreCase("Terça")) {
            System.out.println("É o terceiro dia da semana.");
        } else if ( diaDaSemana.equalsIgnoreCase("Quarta")) {
            System.out.println("É o quarto dia da semana.");
        } else if ( diaDaSemana.equalsIgnoreCase("Quinta")) {
            System.out.println("É o quinto dia da semana.");
        } else if ( diaDaSemana.equalsIgnoreCase("Sexta")) {
            System.out.println("Sextou meu rei!!!");
        } else if ( diaDaSemana.equalsIgnoreCase("Sabado")) {
            System.out.println("Uhhuuuu dia de Maldade!!!!!");
        } else{
            System.out.println("Informação incorreta");
        }

        entrada.close();
    }
}
