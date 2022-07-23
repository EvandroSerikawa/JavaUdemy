package estruturasDeControleExercicios;

import java.util.Scanner;

public class exercicioA {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        System.out.println("Infome um numero: ");
        numero = entrada.nextInt();

        if ( numero <= 10 && numero >= 0 ){
            if ( numero % 2 == 0 ){
                System.out.println("O numero informado é par e esta entre 0 e 10.");
            }
            }else{
                System.out.println("numero fora do especificado.");
            }


        entrada.close();
    }
}
