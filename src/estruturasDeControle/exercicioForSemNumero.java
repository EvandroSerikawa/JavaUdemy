package estruturasDeControle;

public class exercicioForSemNumero {
    public static void main(String[] args) {

//        String valor = "#";
//
//        for ( int i = 1; i<= 5 ; i++ ){
//            System.out.println(valor);
//            valor += "#";
//        }
//        Repetir o laço acima sem valor numérico controlando o laço for

       String i = "#";

        for ( ; !i.equalsIgnoreCase("######") ; i+="#" ){
            System.out.println(i);

        }

    }
}
