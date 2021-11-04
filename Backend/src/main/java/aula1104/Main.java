package aula1104;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import util.Generator;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Pages> pages = new ArrayList<>();
        for(int i =0;i<9;i++){
            pages.add(
                    new Pages(String.format("""
                            www.%s.com.br""",
                            Generator.generateRandomGibberish((int)(Math.random()*12)+3)
                    ))
            );
        }
        FileOutputStream fos = new FileOutputStream("Pages.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(pages);

        FileInputStream fis = new FileInputStream("Pages.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println((ArrayList)ois.readObject());




    }

}
