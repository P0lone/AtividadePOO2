package escopo7;

public class Pedido {
    Carrinho carrinho;
    String formaPagamento;
    String status; //aprovado, pendente, cancelado
    public Pedido(Carrinho carrinho, String formaPagamento, String status){
        this.carrinho = carrinho;
        this.formaPagamento = formaPagamento;
        this.status = status;
    }
}
