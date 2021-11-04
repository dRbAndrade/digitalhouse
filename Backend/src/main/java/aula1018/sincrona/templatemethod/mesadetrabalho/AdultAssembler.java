package aula1018.sincrona.templatemethod.mesadetrabalho;

import javax.swing.*;

public class AdultAssembler extends MenuAssembler{
    @Override
    protected void showOrder(Menu menu, Double price) {
        JOptionPane.showMessageDialog(null,String.format("""
                Menu: Adulto
                Prato: %s
                Valor: R$%.2f
                """,
                menu.getDishName(),
                menu.getBasePrice()));
    }

    @Override
    protected Double calculateTotalPrice(Menu menu) {
        return menu.getBasePrice();
    }

    @Override
    protected void assemble(Menu menu) {
        AdultMenu adultMenu = (AdultMenu) menu;
        adultMenu.setAdditionals(null);
    }
}
