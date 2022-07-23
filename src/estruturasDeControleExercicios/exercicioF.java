package estruturasDeControleExercicios;

import java.util.Random;
import java.util.Scanner;

public class exercicioF {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int continuar = 0;
        int numeroSorteado = 0;
        int tentativas = 0;
        int numero = 0;

        do{
            System.out.println("Sorteando um número aleatório entre 0 e 100");
            Random numeroAleatorio = new Random();
            numeroSorteado = numeroAleatorio.nextInt(101);

            System.out.println("Começo de jogo:");
            tentativas = 0;

            do {
                tentativas++;
                System.out.printf("Tentativas %d:", tentativas);
                numero = entrada.nextInt();

            if ( numero > numeroSorteado ){
                System.out.printf("O numero sorteado é menor que %d\n\n", numero);
            } else if ( numero < numeroSorteado) {
                System.out.printf("O numero sorteado é maior que %d\n\n", numero);
            } else {
                System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);
            }

            } while ( numero != numeroSorteado );
            System.out.println("Digite 0 para sair ou qualquer numero para continuar: ");
            continuar = entrada.nextInt();

        }while(continuar != 0);

        entrada.close();
    }
}
