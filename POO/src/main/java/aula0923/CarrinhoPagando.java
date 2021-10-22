package aula0923;

public class CarrinhoPagando implements EstadoCarrinho {

    private Carrinho carrinho;

    public CarrinhoPagando(Carrinho carrinho) {
        this.carrinho = carrinho;
        System.out.println("Carrinho pagando...\nProdutos: ");
        carrinho.getProdutos().forEach(e-> System.out.println(e));
    }

    @Override
    public void adicionarProduto(Produto p) {
        System.out.println("Carrinho Pagando, não pode mais adicionar");
    }

    @Override
    public void cancelarCarrinho() {
        carrinho.setEstadoCarrinho(new CarrinhoVazio(carrinho));
    }

    @Override
    public void voltar() {
        carrinho.setEstadoCarrinho(new CarrinhoCarregando(carrinho));
    }

    @Override
    public void proximoEstado() {
        carrinho.setEstadoCarrinho(new CarrinhoFechado(carrinho));
    }
}
