package aula0923;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCarregando implements EstadoCarrinho {

    private Carrinho carrinho;

    public CarrinhoCarregando(Carrinho carrinho) {

        this.carrinho = carrinho;
        System.out.println("Carrinho carregando...\nProdutos:");
        carrinho.getProdutos().forEach(e -> {
            System.out.println(e);
        });

    }

    @Override
    public void adicionarProduto(Produto p) {

        carrinho.getProdutos().add(p);
        System.out.printf("Produto adicionado: %s%n", p);

    }

    @Override
    public void cancelarCarrinho() {

        carrinho.setEstadoCarrinho(new CarrinhoVazio(carrinho));

    }

    @Override
    public void voltar() {
        List aux = carrinho.getProdutos();
        if(aux.size()==1||aux.size()==0) carrinho.setEstadoCarrinho(new CarrinhoVazio(carrinho));
        else aux.remove(aux.size()-1);
    }

    @Override
    public void proximoEstado() {
        carrinho.setEstadoCarrinho(new CarrinhoPagando(carrinho));
    }
}
