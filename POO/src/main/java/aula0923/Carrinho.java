package aula0923;

import java.util.ArrayList;
import java.util.List;

public class Carrinho implements EstadoCarrinho{

    private EstadoCarrinho estadoCarrinho;

    private List<Produto> produtos;

    public Carrinho(){
        produtos = new ArrayList<>();
        estadoCarrinho = new CarrinhoVazio(this);
    }

    @Override
    public void adicionarProduto(Produto p) {
        estadoCarrinho.adicionarProduto(p);
    }

    @Override
    public void cancelarCarrinho() {
        estadoCarrinho.cancelarCarrinho();
    }

    @Override
    public void voltar() {
        estadoCarrinho.voltar();
    }

    @Override
    public void proximoEstado() {
        estadoCarrinho.proximoEstado();
    }

    public EstadoCarrinho getEstadoCarrinho() {
        return estadoCarrinho;
    }

    public void setEstadoCarrinho(EstadoCarrinho estadoCarrinho) {
        this.estadoCarrinho = estadoCarrinho;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
