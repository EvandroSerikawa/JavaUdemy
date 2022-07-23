package estruturasDeControleExercicios;

import java.util.Scanner;

public class exercicioC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float primeiraNota = 0;
        float segundaNota = 0;
        float media = 0;

        System.out.println("Informe a primeira nota: ");
        primeiraNota = entrada.nextFloat();

        System.out.println("Informe a segunda nota: ");
        segundaNota = entrada.nextFloat();

        media = (primeiraNota + segundaNota)/2;

        if ( media <= 10 && media >= 0 ){
            if ( media >= 7){
                System.out.println("Aprovado.\nA média do Aluno é: " + media);
            } else if ( media < 7 && media > 4 ) {
                System.out.println("Recuperação.\nA média do aluno é: " + media);
            } else {
                System.out.println("Reprovado.\nA média do aluno é: " + media);
            }
            } else {
                System.out.println("Valores incorretos.");
            }

        entrada.close();
    }
}
