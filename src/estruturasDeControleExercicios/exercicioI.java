package estruturasDeControleExercicios;

import java.util.Scanner;

public class exercicioI {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valor = 0;
        int maiorValor = 0;
        int cont = 0;

        System.out.println("Informe um valor: ");
        valor = entrada.nextInt();

        do{
            System.out.println("Informe um valor: ");
            valor = entrada.nextInt();

            if ( valor > maiorValor ){
                maiorValor = valor;
            }

            cont++;

        } while ( cont != 9 );

        System.out.printf("O maior valor foi: " + maiorValor);

        entrada.close();

    }
}
