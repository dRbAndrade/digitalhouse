package aula0809;

public class Main {

    public static void main(String[] args) {
        Mascote[] mascotes = {
                new Cachorro("Shesheu",2,1500),
                new Peixe("Nemo",1,140),
                new Gato("Snow",3,500)
        };
        //Classe - Objeto
        for(Mascote mascote : mascotes){
           mascote.showInfo();
        }

    }

}