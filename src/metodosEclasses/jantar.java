package metodosEclasses;

public class jantar {
    public static void main(String[] args) {

        comida c1 = new comida("Arroz" , 0.180 );
        comida c2 = new comida("Feijão" , 0.300);

        pessoa pessoa1 = new pessoa("Pessoa1" , 99.8);

        System.out.println(pessoa1.apresentar());

        pessoa1.comer(c1);

        System.out.println(pessoa1.apresentar());

        pessoa1.comer(c2);

        System.out.println(pessoa1.apresentar());

    }
}
