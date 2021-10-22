package aula0923;

public interface EstadoCarrinho {

    void adicionarProduto(Produto p);
    void cancelarCarrinho();
    void voltar();
    void proximoEstado();

}
