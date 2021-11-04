package aula1019;

import javax.swing.*;

public abstract class Salesperson {

    private String name;
    private int score;
    private Rank rank;
    private int sales;

    public Salesperson(String name) {
        this.name = name;
    }

    public void showRank(){
        calculateScore();
        updateRank();
        show();
    }

    protected abstract void calculateScore();

    private void updateRank()  {
        if(!(this instanceof Intern)){
             if(score<20) rank = Rank.NOVICE;
             if(score>20) rank = Rank.APPRENTICE;
             if(score>30) rank = Rank.EXPERIENCED;
             if(score>40) rank = Rank.MASTER;
        }else{
             if(score<50) rank = Rank.NOVICE;
             if(score>49) rank = Rank.EXPERIENCED;
        }
    }

    public void sell(){
        sales++;
    }

    private void show() {
        JOptionPane.showMessageDialog(null, String.format("""
                %s
                Vendas: %d
                Pontuação: %d
                Rank: %s""",
                this,
                getSales(),
                getScore(),
                getRank()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
