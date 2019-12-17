
package org.jarivuomajoki;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class PresenceToolMain extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, Tadaa JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");

        //System.out.println(Double.toString(stage.getMaxHeight() * stage.outputScaleYProperty().doubleValue()) );
        System.out.println("Hello PresenceTool");
        System.out.println("Hello, Tadaa JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");


        // Here get screen bounds

        Scene scene = new Scene(new StackPane(l), 640, 480);

        stage.setScene(scene);

//        stage.setX(100);
//        stage.setY(100);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}