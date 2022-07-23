package estruturasDeControle;

import java.util.Scanner;

public class doWhileRep {
    public static void main(String[] args) {

        Scanner senha = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Digite a senha: ");
            texto = senha.nextLine();
            System.out.println("Senha incorreta.");
        }while (!texto.equalsIgnoreCase("senha"));

        System.out.println("Acesso liberado");

        senha.close();
    }
}
