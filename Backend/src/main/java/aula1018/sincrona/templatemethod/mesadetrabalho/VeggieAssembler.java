package aula1018.sincrona.templatemethod.mesadetrabalho;

import util.Generator;

import javax.swing.*;

public class VeggieAssembler extends MenuAssembler{
    @Override
    protected void showOrder(Menu menu, Double price) {
        VeggieMenu veggieMenu = (VeggieMenu) menu;
        JOptionPane.showMessageDialog(null,String.format("""
                Menu: Vegetariano
                Prato: %s
                Preço: R$%.2f
                Adicionais: 
                %s
                Embalagem: %s
                Valor dos condimentos: %.2f%%
                Valor Total: R$%.2f
                """,
                veggieMenu.getDishName(),
                veggieMenu.getBasePrice(),
                veggieMenu.getAdditionalsAsString(),
                veggieMenu.getSpecialPackaging(),
                veggieMenu.getCondimentsValue()*100,
                price));
    }

    @Override
    protected Double calculateTotalPrice(Menu menu) {
        VeggieMenu veggieMenu = (VeggieMenu) menu;
        final Double[] additionalTotal = {0.0};
        veggieMenu.getAdditionals().forEach((dish, dishValue) -> additionalTotal[0]+=dishValue);
        return (veggieMenu.getBasePrice() + additionalTotal[0])*(1+veggieMenu.getCondimentsValue());
    }

    @Override
    protected void assemble(Menu menu) {
        VeggieMenu veggieMenu = (VeggieMenu) menu;
        veggieMenu.setDishName(Generator.generateRandomGibberish(6));
        veggieMenu.setBasePrice(Math.random()*90+10);
        int control = (int)(Math.random()*10);
        for (int i =0; i<control;i++){
            veggieMenu.getAdditionals().put(
                    Generator.generateRandomGibberish(6),
                    Math.random()*10+1
            );
        }
    }
}
