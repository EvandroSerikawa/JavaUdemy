package estruturasDeControleExercicios;

import java.util.Scanner;

public class exercicioH {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String palavra = "";

        System.out.println("Digite uma palavra");
        palavra = entrada.nextLine();

        char letras[] = palavra.toCharArray();

        for ( int i = 0 ; i < letras.length ; i++ ){
            System.out.println(letras[i]);
        }

        entrada.close();
    }
}
