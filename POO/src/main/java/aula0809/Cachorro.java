package aula0809;

import java.util.Scanner;

public class Cachorro extends Mascote{

    public Cachorro(String nome, int idade, int qtdComida) {
        super(nome, idade, qtdComida);
        setSom("Au Au");
    }

    public Cachorro(String nome, int qtdComida){
        this(nome,0,qtdComida);
    }

    public int quantosPacotes(){
        Scanner sc = new Scanner(System.in);
        int quantidade = 0;
        int contador = 0;
        System.out.println("Insira um pacote: ");
        quantidade += sc.nextInt();
        contador++;
        while (quantidade<this.getQtdComida()) {
            System.out.println("Insira outro pacote: ");
            quantidade += sc.nextInt();
            contador++;
        }

        return contador;
    }

}
