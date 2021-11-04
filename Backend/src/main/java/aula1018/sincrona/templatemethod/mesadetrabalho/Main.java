package aula1018.sincrona.templatemethod.mesadetrabalho;

public class Main {

    public static void main(String[] args) {

        Menu adultMenu = AdultMenu.generateRandomAdultMenu();
        Menu childMenu = ChildMenu.generateRandomChildMenu();
        Menu veggieMenu = VeggieMenu.generateRandomVeggieMenu();

        MenuAssembler veggieAssembler = new VeggieAssembler();
        MenuAssembler childAssembler = new ChildAssembler();
        MenuAssembler adultAssembler = new AdultAssembler();

        veggieAssembler.assembleMenu(veggieMenu);
        childAssembler.assembleMenu(childMenu);
        adultAssembler.assembleMenu(adultMenu);


    }

}
