package metodosEclasses;

public class produtoTeste {
    public static void main(String[] args) {

        produto p1 = new produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * ( 1 - p1.desconto);
        double precoFInal2 = p2.preco * ( 1 - p2.desconto);
        double mediaDoCarrinho = (precoFinal1 + precoFInal2)/2;

        System.out.printf("A média do carrinho é = R$ %.2f.", mediaDoCarrinho);

    }
}
