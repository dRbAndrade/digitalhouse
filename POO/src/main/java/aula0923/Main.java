package aula0923;

public class Main {

    public static void main(String[] args) {

        Produto a = new Produto("que merda",10.0);
        Produto b = new Produto("de padrão",20.0);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(a);
        carrinho.adicionarProduto(b);
        carrinho.proximoEstado();
        carrinho.proximoEstado();
        carrinho.voltar();

    }

}
