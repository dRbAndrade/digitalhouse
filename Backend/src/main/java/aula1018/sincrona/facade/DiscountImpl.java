package aula1018.sincrona.facade;

import javax.swing.*;
import java.util.List;

public class DiscountImpl implements DiscountFacade {

    public static void main(String[] args) {

        int quantity = (int) (Math.random()*100);
        Card card = Card.generateRandomCard();
        List<Product> productList = Product.generateRandomProducts();
        Product product = productList.get((int) (Math.random()*10));
        double discount = new DiscountImpl().applyAllDiscounts(card,product,quantity);
        double total = product.getValue()*quantity;
        JOptionPane.showMessageDialog(null,
                String.format(
                        """
                        Produto: %s
                        Preço Unitário: %.2f
                        Quantidade: %d
                        Tipo:%s
                        Cartão: %s
                        Banco: %s
                        Total: R$%.2f
                        Desconto: %.2f%%
                        Total com desconto: R$%.2f""",
                        product.getName(),
                        product.getValue(),
                        quantity,
                        product.getType(),
                        censorCardNumber(card),
                        card.getBank(),
                        total,
                        discount*100 ,
                        total*(1-discount))
        );



    }

    private static String censorCardNumber(Card card) {
        return String.format("*****%s*****",card.getNumber().substring(5,card.getNumber().length()-5));
    }

    @Override
    public Double applyAllDiscounts(Card card, Product product, Integer quantity) {
        return ProductAPI.applyDiscount(product)
                + CardAPI.applyDiscount(card)
                + QuantityAPI.applyDiscount(quantity);

    }

}
