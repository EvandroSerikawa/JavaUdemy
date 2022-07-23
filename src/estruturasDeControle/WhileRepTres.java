package estruturasDeControle;

import java.util.Scanner;

public class WhileRepTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra = "";

        while (!palavra.equalsIgnoreCase("sair")){
            System.out.println("Você diz: ");
            palavra = sc.nextLine();
        }

        sc.close();

    }
}
