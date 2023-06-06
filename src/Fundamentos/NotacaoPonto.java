package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s.toUpperCase(); // Não altera para maiuscula pois o comando afeta somente essa lina
        s = s.toUpperCase(); // Nesse caso a variavel recebe o valor com a alteração do Caps lock
        System.out.println(s);

        //ex2:
        s = s.replace("X", "senhora");
        s = s.toLowerCase();
        System.out.println(s);

        //ex: impressao de valor com ponto sem declarar a variável
        System.out.println("Evandro X".replace("X", "Serikawa"));

        String y = "Bom dia X"
                .replace("X", "Senhora")
                .toUpperCase()
                .concat("!");
        System.out.println(y);

        //Importante - Tipos primitivos não tem o operador "."
        //ex: int a = 3;
        // a. não existe pois o tipo primitivo armazena apenas o valor

    }
}
