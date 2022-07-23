package estruturasDeControleExercicios;

import java.util.Scanner;

public class exercicioD {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int cont = 0;

        System.out.println("Informe um numero: ");
        numero = entrada.nextInt();

        for ( int i = 2 ; i < numero ; i++){
            if( numero % 1 == 0 ){
                cont++;
            }
        }

        if ( cont == 0){
            System.out.println("O numero " + numero +" é primo.");
        } else {
            System.out.println("O numero " + numero +" Não é primo.");
        }

        entrada.close();
    }
}
