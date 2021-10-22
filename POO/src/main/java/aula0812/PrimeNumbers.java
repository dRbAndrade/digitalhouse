package Aula0812;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int qtd = sc.nextInt();
        List<Long> numerosPrimos = firstPrimeNumbers(qtd);
        System.out.printf("%nOs primeiros %d números primos são: %n",qtd);
        numerosPrimos.forEach(e->{
            System.out.printf("%dº <====> %d%n",numerosPrimos.indexOf(e)+1,e);
        });

    }

    public static List<Long> firstPrimeNumbers(int qty){
        List<Long> primeNumberList = new ArrayList<>();
        long candidate = 0;
        while(primeNumberList.size()!=qty){
            if(isPrime(candidate))primeNumberList.add(candidate);
            candidate++;
        }
        return primeNumberList;
    }

    public static boolean isPrime(Long l){

        if(l==0||l==1)return false;
        if(l==2||l==3||l==5)return true;
        if(l%2==0)return false;
        for(int i = 3;i<l/2;i+=2){
            if(l%i==0){
                return false;
            }
        }
        return true;
    }

}