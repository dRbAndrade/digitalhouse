package aula1111.model;


import java.util.List;
import java.util.TreeSet;

public class Lottery {

    List<TreeSet<Integer>> games;

    public Lottery(List<TreeSet<Integer>> games){
        this.games = games;
    }

    @Override
    public String toString() {
        final String[] gamesString={"{<br>"};
        games.forEach(e->{
            gamesString[0]+="&nbsp;&nbsp;&nbsp;&nbsp;"+e+"<br>";
        });
        return gamesString[0]+"}";
    }
}
