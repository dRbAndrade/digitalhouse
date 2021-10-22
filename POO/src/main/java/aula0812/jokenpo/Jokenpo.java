package aula0812.jokenpo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Jokenpo extends Application {

    @Override
    public void start(Stage primaryStage) {

        JokenpoRoot jr = new JokenpoRoot();
        Scene root = new Scene(jr);
        primaryStage.setFullScreen(true);
        primaryStage.setScene(root);
        primaryStage.setTitle("Jokenpo");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
