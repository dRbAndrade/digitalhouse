package aula0811;

import java.util.Scanner;

public class MesaTrabalho {

    //Faça uma função que, dado um número, indique se é um número primo ou não.
    //Um número primo é aquele que só pode ser dividido por 1 e ele mesmo.
    //Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25.
    //17 é primo porque só pode ser dividido por 1 e por 17.
    //Para usar esta função que iremos criar  em um programa,
    //podemos  permitir a entrada de apenas um número para verificar se o número é primo ou não.
    //Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona,
    //Boolean e Divisível (int n, int divisor).

    //Escreva uma função que receba três números e retorne o máximo dos três números.
    //int maximoEntreTresNumeros(int umNumeroA, int umNumeroB, int umNumeroC)
    //Em seguida, faça um programa que permita a entrada de 3 valores, use a função e exiba o resultado.


    //Digite seu nome e sobrenome separadamente, a partir dessas variáveis obtenha em uma terceira,
    //suas iniciais e sua data de nascimento, para a data digite 3 valores que representam dia, mês e ano.
    //Em seguida, exiba uma mensagem, como se fosse um token, com seu nomes,
    //as iniciais do seu nome e sobrenome e sua data de nascimento no formato "dd / mm / aaaa"
    //Nota: Use alguma função para resolver, por exemplo, dados os 3 valores, retorne a data como uma string.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu primeiro nome.");
        String nome = sc.nextLine();
        System.out.println("Insira seu sobrenome.");
        String sobrenome = sc.nextLine();
        String iniciais = String.format("%s.%s.",nome.charAt(0),sobrenome.charAt(0));
        System.out.println("Digite o dia do seu nascimento:");
        int dia = sc.nextInt();
        System.out.println("Digite o mes do seu nascimento:");
        int mes = sc.nextInt();
        System.out.println("Digite o ano do seu nascimento:");
        int ano = sc.nextInt();
        System.out.printf("%s - %d/%d/%d",iniciais,dia,mes,ano);

    }



}
