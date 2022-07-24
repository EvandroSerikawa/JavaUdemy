package metodosEclasses;

public class produtoTeste {
    public static void main(String[] args) {

        produto p1 = new produto("Notebook",4356.89 );

        var p2 = new produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.56;

        produto.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFInal2 = p2.precoComDesconto(0.1);
        double mediaDoCarrinho = (precoFinal1 + precoFInal2)/2;

        System.out.printf("A média do carrinho é = R$ %.2f.", mediaDoCarrinho);

    }
}
