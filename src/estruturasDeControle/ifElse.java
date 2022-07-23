package estruturasDeControle;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        float primeiraNota = 0;
        float segundaNota = 0;
        float terceiraNota = 0;
        float quartaNota = 0;
        float media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        primeiraNota = entrada.nextFloat();

        System.out.println("Informe a segunda nota: ");
        segundaNota = entrada.nextFloat();

        System.out.println("Informe a terceira nota: ");
        terceiraNota = entrada.nextFloat();

        System.out.println("Informe a quarta nota: ");
        quartaNota = entrada.nextFloat();

        media = (primeiraNota + segundaNota + terceiraNota + quartaNota )/4;

        System.out.println("A média do aluno é: "  + media);

        if( media >= 7){
            System.out.println("Aprovado!");
            System.out.println("Parabens!");
        }else{
            System.out.println("Reprovado.");
        }

        entrada.close();
    }
}
