package estruturasDeControle;

import java.util.Scanner;

public class whileRep {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

          int quantidadeDeNotas = 0;
          float nota = 0;
          float total = 0;
          float media = 0;

          while( nota != -1 ){
              System.out.println("Informe uma nota: ");
              nota = sc.nextFloat();

          if( nota <= 10 && nota >= 0 ){
              total += nota;
              quantidadeDeNotas++;
          } else if ( nota != -1) {
              System.out.println("Nota Inválida.");
          }

          }
            media = total / quantidadeDeNotas;
            System.out.println("A média é " + media );

        sc.close();
    }
}
