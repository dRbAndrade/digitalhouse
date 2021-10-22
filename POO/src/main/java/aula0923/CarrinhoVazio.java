package aula0923;

import java.util.ArrayList;

public class CarrinhoVazio implements EstadoCarrinho{

    private Carrinho carrinho;

    public CarrinhoVazio(Carrinho carrinho){
        this.carrinho=carrinho;
        carrinho.setProdutos(new ArrayList<>());
        System.out.println("Carrinho Vazio.");
    }

    @Override
    public void adicionarProduto(Produto p) {
        carrinho.getProdutos().add(p);
        carrinho.setEstadoCarrinho(new CarrinhoCarregando(carrinho));
    }

    @Override
    public void cancelarCarrinho() {
        System.out.println("Carrinho já está vazio.");
    }

    @Override
    public void voltar() {
        System.out.println("Carrinho já é novo");
    }

    @Override
    public void proximoEstado() {
        System.out.println("Adicione um produto primeiro");
    }
}
