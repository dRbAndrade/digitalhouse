package main.java.aula1019;

import javax.swing.*;

public abstract class Salesperson {

    private String name;
    private int score;
    private Rank rank;
    private int sales;

    public void showRank(Salesperson salesperson){
        calculateScore(salesperson);
        updateRank(salesperson);
        show(salesperson);
    }

    protected abstract void calculateScore(Salesperson salesperson);

    private void updateRank(Salesperson salesperson) {
        if(!(salesperson instanceof Intern)){
            salesperson.rank = salesperson.score<20 ? Rank.NOVICE:null;
            salesperson.rank = salesperson.score>20 ? Rank.APPRENTICE:null;
            salesperson.rank = salesperson.score>30 ? Rank.EXPERIENCED:null;
            salesperson.rank = salesperson.score>40 ? Rank.MASTER:null;
        }else{
            salesperson.rank = salesperson.score<50 ? Rank.NOVICE:null;
            salesperson.rank = salesperson.score>49 ? Rank.EXPERIENCED:null;
        }
    }
    private void show(Salesperson salesperson) {
        JOptionPane.showMessageDialog(null, """
                """);
    }


}
