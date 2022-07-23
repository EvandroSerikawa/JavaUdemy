package estruturasDeControleExercicios;

import java.util.Scanner;

public class exercicioG {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int total = 0;

        System.out.println("Informe um numero: ");
        numero = entrada.nextInt();

        while ( numero > 0 ){
            System.out.println( numero );
            total += numero;
            System.out.println( total );

            System.out.println("Informe um numero: ");
            numero = entrada.nextInt();
        }


        entrada.close();
    }
}
