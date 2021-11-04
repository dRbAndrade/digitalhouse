package aula1018.sincrona.templatemethod.mesadetrabalho;

public abstract class MenuAssembler {

    public void assembleMenu(Menu menu){
        assemble(menu);
        Double price = calculateTotalPrice(menu);
        showOrder(menu, price);
    }

    protected abstract void showOrder(Menu menu, Double price);

    protected abstract Double calculateTotalPrice(Menu menu);

    protected abstract void assemble(Menu menu);

}
