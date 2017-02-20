package net.hive.javaxf.blablacarcalc.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import java.io.IOException;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("/net/hive/javaxf/blablacarcalc/fxml/main.fxml"));
        primaryStage.setTitle("Calculator v.1.0");
        primaryStage.setMinHeight(450);
        primaryStage.setMinWidth(300);
        primaryStage.setMaxHeight(450);
        primaryStage.setMaxWidth(300);
        primaryStage.setScene(new Scene(root, 395, 280));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
