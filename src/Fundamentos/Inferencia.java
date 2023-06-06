package Fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        //inferência - criar a variavel sem o tipo
        // ex: var b = double pelo valor
        double a = 4.5;
        System.out.println(a);
        var b = 4.5;
        System.out.println(b);
        var c = "texto";
        System.out.println(c);
        c="Outro texto";
        System.out.println(c);

        double d;
        d = 123.65;
        System.out.println(d);

        var e = 123.45;
        System.out.println(e);
    }
}
