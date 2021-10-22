package aula0812;

import aula0809.Cachorro;

import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o nome do seu dog?");
        String nome = sc.nextLine();
        System.out.println("Quanto ele come?");
        int qtd = sc.nextInt();
        Cachorro dog = new Cachorro(nome,qtd);

        System.out.printf("""
                %s precisa de %d pacotes.""",
                dog.getNome(),dog.quantosPacotes());

    }

}
