package escopo7;

public class Main {
    public static void main(String[] args) {
        Cliente gustavo = new Cliente("Gustavo", "Estado", "Cidade", "Rua x");
        Produto celular = new Produto("Celular", "Aparelho", 1299.99);
        Carrinho carrinho = new Carrinho(gustavo, celular);
        Estoque celularEstoque = new Estoque(celular, 5);
        Pedido pedido01 = new Pedido(carrinho, "PIX", "Aprovado");
        Relatorio relatorio = new Relatorio(celular, 1299.99, 1000);
    }
}
