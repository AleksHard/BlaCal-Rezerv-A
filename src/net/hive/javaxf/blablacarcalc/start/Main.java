//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package net.hive.javaxf.blablacarcalc.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("../fxml/main.fxml"));
        primaryStage.setTitle("Calculator v.1.0");
        primaryStage.setMinHeight(380);
        primaryStage.setMinWidth(310);
        primaryStage.setMaxHeight(380);
        primaryStage.setMaxWidth(310);
        primaryStage.setScene(new Scene(root, 380, 310));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
