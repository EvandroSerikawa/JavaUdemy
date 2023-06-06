package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações de um funcionario ex:

        //Tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        // Tipos Numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipos Booleanos
        boolean estaDeFerias = false;

        //Tipos caracteres
        char status = '1'; //ativo

        //Dias de empreasa
        System.out.println(anosDeEmpresa * 365);

        //NUmero de viagens
        System.out.println(numeroDeVoos / 2);

        //POntos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println( id + " : ganha -> " + salario);
        System.out.println("Ferias" + estaDeFerias );
        System.out.println("Status" + status);
    }
}
