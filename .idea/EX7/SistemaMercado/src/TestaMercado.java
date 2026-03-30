public class TestaMercado {

    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Batata", 5.0);
        Produto p2 = new Produto(2, "Suco", 4.0);

        Cliente cliente = new Cliente(1, "Maria");

        Vendas venda = new Vendas(1, cliente);

        venda.adicionarItem(1, 4, p1);
        venda.adicionarItem(2, 2, p2);

        System.out.println(venda);
    }

}
