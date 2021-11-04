package aula1104.mesadetrabalho;

import aula1104.Pages;
import util.Generator;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("Contacts.txt");
        FileInputStream fis = new FileInputStream("Contacts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Contact> contacts = new ArrayList<>();
        for(int i =0;i<9;i++){
            contacts.add(
                    new Contact(
                            Generator.generateRandomGibberish((int)(Math.random()*6)+4),
                            String.format("%s@gmail.com",Generator.generateRandomGibberish((int)(Math.random()*15)+4)),
                            Generator.generateRandomNumberSequence(11)
                    )
            );
        }
        oos.writeObject(contacts);

        ArrayList<Contact> contacts2 = (ArrayList<Contact>) ois.readObject();

        System.out.println(contacts2);

    }

}
