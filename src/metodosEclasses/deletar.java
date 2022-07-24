package metodosEclasses;

import java.util.Arrays;
import java.util.Scanner;

public class deletar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[4];

        for ( int i = 0 ; i < nomes.length ; i++){
            System.out.println("Preencha o nome: ");
            nomes[i] = entrada.nextLine();
        }

        //System.out.println(Arrays.toString(nomes));
        System.out.println(nomes[1].trim());
        System.out.println(nomes[3].trim());


        entrada.close();
    }
}
