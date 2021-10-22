package aula0923;

public class CarrinhoFechado implements EstadoCarrinho{

    private Carrinho carrinho;

    public CarrinhoFechado(Carrinho carrinho){
        this.carrinho = carrinho;
        System.out.println("Carrinho fechado. Produtos:");
        carrinho.getProdutos().forEach(e-> System.out.println(e));
        System.out.println("Obriado pela compra!");
    }
    @Override
    public void adicionarProduto(Produto p) {
        System.out.println("Carrinho fechado, não pode mais adicionar");
    }

    @Override
    public void cancelarCarrinho() {
        System.out.println("Carrinho fechado, não pode mais cancelar");
    }

    @Override
    public void voltar() {
        System.out.println("Carrinho fechado, não pode mais voltar");
    }

    @Override
    public void proximoEstado() {
        carrinho.setEstadoCarrinho(new CarrinhoVazio(carrinho));
    }
}
