package main.java.aula1025.flyweight;

import java.util.HashSet;
import java.util.Set;

public class FlyweightFactory {

    private Set<Tree> treeSet= new HashSet<>();

    public Tree createTree(Tree tree){

        if(!treeSet.contains(tree)) {
            treeSet.add(tree);
            return tree;
        }else{

            return treeSet.stream().filter(e->e.equals(tree)).findAny().get();

        }


    }

    public Set<Tree> getTreeSet() {
        return treeSet;
    }

    public void setTreeSet(Set<Tree> treeSet) {
        this.treeSet = treeSet;
    }

}
