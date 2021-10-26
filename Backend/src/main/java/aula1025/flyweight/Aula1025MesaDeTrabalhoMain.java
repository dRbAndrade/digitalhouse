package main.java.aula1025.flyweight;

public class Aula1025MesaDeTrabalhoMain {

    public static void main(String[] args) {

        Tree fruitTree = new Tree(500,300,"Vermelho");
        Tree flowerTree = new Tree(100,200,"Azul");
        Tree ornamental = new Tree(200,400,"Verde");
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        for(int i = 0;i<500000;i++){
            fruitTree = flyweightFactory.createTree(fruitTree);
            flowerTree = flyweightFactory.createTree(flowerTree);
            ornamental = flyweightFactory.createTree(ornamental);
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }

}
