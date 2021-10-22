package aula0812.jokenpo;

import javafx.animation.ScaleTransition;
import javafx.geometry.Dimension2D;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Cursor;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.util.Duration;

import java.awt.*;
import java.util.Objects;

public class JokenpoRoot extends GridPane{

    private static ScaleTransition stRockIn, stPaperIn, stScissorsIn, stLizardIn,stSpockIn;
    private static ScaleTransition stRockOut, stPaperOut, stScissorsOut, stLizardOut,stSpockOut;
    private static ImageView rockView,paperView,scissorsView,lizardView,spockView;
    private static final Dimension2D imageSize = new Dimension2D(
            Toolkit.getDefaultToolkit().getScreenSize().getWidth()/7,
            Toolkit.getDefaultToolkit().getScreenSize().getHeight()/4
    );
    private static final ScorePane sp = new ScorePane();

    public JokenpoRoot() {

        rockView = new ImageView();
        rockView.getStyleClass().add("rock-standard");
        paperView = new ImageView();
        paperView.getStyleClass().add("paper-standard");
        scissorsView = new ImageView();
        scissorsView.getStyleClass().add("scissors-standard");
        lizardView = new ImageView();
        lizardView.getStyleClass().add("lizard-standard");
        spockView = new ImageView();
        spockView.getStyleClass().add("spock-standard");

        stRockIn = new ScaleTransition(Duration.millis(200), rockView);
        stPaperIn = new ScaleTransition(Duration.millis(200), paperView);
        stScissorsIn = new ScaleTransition(Duration.millis(200), scissorsView);
        stLizardIn = new ScaleTransition(Duration.millis(200), lizardView);
        stSpockIn = new ScaleTransition(Duration.millis(200), spockView);
        stRockOut = new ScaleTransition(Duration.millis(200), rockView);
        stRockOut.setOnFinished(e->{
            double x = rockView.getScaleX();
            if(x!=1){
                rockView.setScaleX(1);
                rockView.setScaleY(1);
            }
        });
        stPaperOut = new ScaleTransition(Duration.millis(200), paperView);
        stPaperOut.setOnFinished(e->{
            double x = paperView.getScaleX();
            if(x!=1){
                paperView.setScaleX(1);
                paperView.setScaleY(1);
            }
        });
        stScissorsOut = new ScaleTransition(Duration.millis(200), scissorsView);
        stScissorsOut.setOnFinished(e->{
            double x = scissorsView.getScaleX();
            if(x!=1){
                scissorsView.setScaleX(1);
                scissorsView.setScaleY(1);
            }

        });
        stLizardOut = new ScaleTransition(Duration.millis(200), lizardView);
        stLizardOut.setOnFinished(e->{
            double x = lizardView.getScaleX();
            if(x!=1){
                lizardView.setScaleX(1);
                lizardView.setScaleY(1);
            }

        });
        stSpockOut = new ScaleTransition(Duration.millis(200), spockView);
        stSpockOut.setOnFinished(e->{
            double x = spockView.getScaleX();
            if(x!=1){
                spockView.setScaleX(1);
                spockView.setScaleY(1);
            }

        });

        ImageView[] views = new ImageView[]{rockView, paperView, scissorsView, lizardView, spockView};


        for (ImageView view : views) {
            view.setFitHeight(imageSize.getHeight());
            view.setFitWidth(imageSize.getWidth());
            view.setPickOnBounds(true);
            view.setCursor(Cursor.HAND);
            view.getStyleClass().add("image-view");
        }

        for(int i =0;i<50;i++){
            ColumnConstraints c = new ColumnConstraints();
            c.setPercentWidth(2);
            c.setHalignment(HPos.CENTER);
            RowConstraints r = new RowConstraints();
            r.setPercentHeight(2);
            r.setValignment(VPos.CENTER);
            getColumnConstraints().add(c);
            getRowConstraints().add(r);
        }

        addEvents();
        setAlignment(Pos.CENTER);
        getStyleClass().add("rootPane");
        getStylesheets().add(Objects.requireNonNull(getClass().getResource("jokenpo.css")).toExternalForm());

        add(rockView,12,17,7,15);
        add(lizardView,16,33,7,15);
        add(scissorsView,21,1,7,15);
        add(spockView,26,33,7,15);
        add(paperView,30,17,7,15);
        add(sp,19,15,11,19);

    }

    private void addEvents() {

        rockView.setOnMouseEntered(event -> {
            stRockOut.stop();
            stRockIn.setByY(0.05);
            stRockIn.setByX(0.05);
            stRockIn.play();
        });
        rockView.setOnMouseExited(event -> {
            stRockIn.stop();
            stRockOut.setByY(1-rockView.getScaleY());
            stRockOut.setByX(1-rockView.getScaleX());
            stRockOut.play();
        });
        rockView.setOnMouseClicked(e-> JokenpoController.play(Options.ROCK));

        paperView.setOnMouseEntered(event -> {
            stPaperOut.stop();
            stPaperIn.setByY(0.05);
            stPaperIn.setByX(0.05);
            stPaperIn.play();
        });
        paperView.setOnMouseExited(event -> {
            stPaperIn.stop();
            stPaperOut.setByY(1-paperView.getScaleY());
            stPaperOut.setByX(1-paperView.getScaleX());
            stPaperOut.play();
        });
        paperView.setOnMouseClicked(e-> JokenpoController.play(Options.PAPER));
        scissorsView.setOnMouseEntered(event -> {
            stScissorsOut.stop();
            stScissorsIn.setByY(0.05);
            stScissorsIn.setByX(0.05);
            stScissorsIn.play();
        });
        scissorsView.setOnMouseExited(event -> {
            stScissorsIn.stop();
            stScissorsOut.setByY(1-scissorsView.getScaleY());
            stScissorsOut.setByX(1-scissorsView.getScaleX());
            stScissorsOut.play();
        });
        scissorsView.setOnMouseClicked(e-> JokenpoController.play(Options.SCISSORS));
        lizardView.setOnMouseEntered(event -> {
            stLizardOut.stop();
            stLizardIn.setByY(0.05);
            stLizardIn.setByX(0.05);
            stLizardIn.play();
        });
        lizardView.setOnMouseExited(event -> {
            stLizardIn.stop();
            stLizardOut.setByY(1-lizardView.getScaleY());
            stLizardOut.setByX(1-lizardView.getScaleX());
            stLizardOut.play();
        });
        lizardView.setOnMouseClicked(e-> JokenpoController.play(Options.LIZARD));
        spockView.setOnMouseEntered(event -> {
            stSpockOut.stop();
            stSpockIn.setByY(0.05);
            stSpockIn.setByX(0.05);
            stSpockIn.play();
        });
        spockView.setOnMouseExited(event -> {
            stSpockIn.stop();
            stSpockOut.setByY(1-spockView.getScaleY());
            stSpockOut.setByX(1-spockView.getScaleX());
            stSpockOut.play();
        });
        spockView.setOnMouseClicked(e-> JokenpoController.play(Options.SPOCK));

    }
    public static void changeImages(Options winner, Options loser){
        rockView.getStyleClass().set(0,"rock-standard");
        paperView.getStyleClass().set(0,"paper-standard");
        scissorsView.getStyleClass().set(0,"scissors-standard");
        lizardView.getStyleClass().set(0,"lizard-standard");
        spockView.getStyleClass().set(0,"spock-standard");

        switch(winner.toString()){
            case "Pedra" -> rockView.getStyleClass().set(0,"rock-win");
            case "Papel" -> paperView.getStyleClass().set(0,"paper-win");
            case "Tesoura" -> scissorsView.getStyleClass().set(0,"scissors-win");
            case "Lagarto" -> lizardView.getStyleClass().set(0,"lizard-win");
            case "Spock" -> spockView.getStyleClass().set(0,"spock-win");
        }

        switch(loser.toString()){
            case "Pedra" -> rockView.getStyleClass().set(0,"rock-lose");
            case "Papel" -> paperView.getStyleClass().set(0,"paper-lose");
            case "Tesoura" -> scissorsView.getStyleClass().set(0,"scissors-lose");
            case "Lagarto" -> lizardView.getStyleClass().set(0,"lizard-lose");
            case "Spock" -> spockView.getStyleClass().set(0,"spock-lose");
        }

    }

}
