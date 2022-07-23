package estruturasDeControle;

import java.util.Locale;

public class switchEst {
    public static void main(String[] args) {
        // Switch sem o break - não é muito utilizado ( apenas para o default)
        // Não recebe valor booleano - recebe um valor fixo para verificação dos casos

        String faixa = "roxa";

        switch (faixa.toLowerCase(Locale.ROOT)){
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "Laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "Maarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Não sei nada");
        }

        //ex 2: SEM NEHUM BREAK
        System.out.println(" **********************************  ");
        System.out.println("Exemplo 02 - idade de uma criança ");

        int idade = 3;

        switch (idade){
            case 3:
                System.out.println("Sabe ir ao banheiro");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Sabe respirar");
        }


    }
}
