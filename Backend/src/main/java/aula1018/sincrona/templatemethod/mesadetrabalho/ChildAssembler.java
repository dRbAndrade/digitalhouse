package main.java.aula1018.sincrona.templatemethod.mesadetrabalho;

import main.java.util.Generator;

import javax.swing.*;

public class ChildAssembler extends MenuAssembler {
    @Override
    protected void showOrder(Menu menu, Double price) {
        ChildMenu childMenu = (ChildMenu) menu;
        JOptionPane.showMessageDialog(null,String.format("""
                Menu: Infantil
                Prato: %s
                Preço: R$%.2f
                Adicionais: 
                %s
                Surpresa: %s
                Valor Total: %.2f
                """,
                childMenu.getDishName(),
                childMenu.getBasePrice(),
                childMenu.getAdditionalsAsString(),
                childMenu.getSurprise(),
                price));
    }

    @Override
    protected Double calculateTotalPrice(Menu menu) {
        ChildMenu childMenu = (ChildMenu) menu;
        final Double[] aditionalsTotal = {0.0};
        childMenu.getAdditionals().forEach((dish, dishValue) -> aditionalsTotal[0]+=dishValue);
        return childMenu.getBasePrice() + aditionalsTotal[0];
    }

    @Override
    protected void assemble(Menu menu) {
        ChildMenu childMenu = (ChildMenu) menu;
        int control = (int)(Math.random()*10);
        for (int i =0; i<control;i++){
            childMenu.getAdditionals().put(
                    Generator.generateRandomGibberish(6),
                    Math.random()*10+1
            );
        }
        childMenu.setSurprise(Generator.generateRandomGibberish(5));
        childMenu.setSurpriseValue(Math.random()*20+1);
    }
}
