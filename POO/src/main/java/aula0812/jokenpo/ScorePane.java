package aula0812.jokenpo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ScorePane extends VBox {

    public static int PLAYER = 1;
    public static int CPU = 2;
    private static int playerScore = 0;
    private static int cpuScore = 0;
    private static final Label result = new Label("");
    private static final Label scoreLabel = new Label("");

    public ScorePane(){
        result.setAlignment(Pos.CENTER);
        result.setStyle("-fx-font-size:16px;-fx-text-fill:#F0F0F0;-fx-font-weight:700;");
        scoreLabel.setAlignment(Pos.CENTER);
        scoreLabel.setStyle("-fx-font-size:32px;-fx-text-fill:#F0F0F0;-fx-font-weight:700;");

        setAlignment(Pos.CENTER);
        getChildren().addAll(result,scoreLabel);
    }

    public static void score(int scorer,  Options playerOption, Options cpuOption ){
        if(scorer==CPU){
            cpuScore++;
            result.setText(String.format(
                    "Você escolheu: %s\nCPU escolheu: %s\nVocê perdeu!",
                    playerOption,cpuOption
            ));
        }else if(scorer==PLAYER){
            playerScore++;
            result.setText(String.format(
                    "Você escolheu: %s\nCPU escolheu: %s\nVocê ganhou!",
                    playerOption,cpuOption
            ));
            
        }else{
            result.setText(String.format(
                    "Você escolheu: %s\nCPU escolheu: %s\nDeu empate!",
                    playerOption,cpuOption
            ));
        }
        scoreLabel.setText(String.format("""
                    Você %d X %d CPU""",
                playerScore,cpuScore
        ));
    }

}
