package estruturasDeControleExercicios;

import java.util.Scanner;

public class exercicioB {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int ano = 0;

        System.out.println("Informe o ano: ");
        ano = entrada.nextInt();

        if ((( ano % 4 == 0) && ( ano % 100 != 0 )) || ( ano % 400 == 0)){
            System.out.println("O ano é Bissexto ");
        }else{
            System.out.println("O ano informado não é Bissexto");
        }

        entrada.close();

    }
}
