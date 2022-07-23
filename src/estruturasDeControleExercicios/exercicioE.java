package estruturasDeControleExercicios;

import java.util.Scanner;

public class exercicioE {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int cont = 0;

        System.out.println("Informe um numero: ");
        numero = entrada.nextInt();

        for ( int i = 2 ; i < numero ; i++ ){
            if ( numero % i == 0){
                cont++;
            }
        }

        switch (cont){
            case 1:
                System.out.println("O numero " + numero + " é primo.");
                break;
            default:
                System.out.println("O numero " + numero + " não é primo.");
        }


        entrada.close();
    }
}
