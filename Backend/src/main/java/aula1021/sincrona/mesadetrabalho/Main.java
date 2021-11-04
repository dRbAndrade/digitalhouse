package aula1021.sincrona.mesadetrabalho;

import util.Generator;

public class Main {

    public static void main(String[] args) {

        User userFree = new User(
                Generator.generateRandomGibberish(7),
                Generator.generateRandomNumberSequence(7),
                "Free"
        );
        User userPremium = new User(
                Generator.generateRandomGibberish(7),
                Generator.generateRandomNumberSequence(7),
                "Premium"
        );

        Downloader proxy = new DownloaderProxy(new DownloaderService());

        proxy.download(userFree);
        proxy.download(userPremium);


    }

}
