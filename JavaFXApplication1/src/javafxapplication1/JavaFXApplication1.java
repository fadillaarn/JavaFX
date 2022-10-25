/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author fadillarizky
 */
public class JavaFXApplication1 extends Application {

    // launch the application
    public void start(Stage s)
    {
        s.setTitle("Fadilla Rizky Nurhidayah");

        VBox body = new VBox();

        Button b1 = new Button("Click");
        Button b2 = new Button("Tap Here");
        HBox div1 = new HBox();

        div1.getChildren().addAll(b1, b2);

        StackPane r = new StackPane();
        r.getChildren().addAll(div1);
        Scene scene = new Scene(r, 200, 200);

        s.setScene(scene);
        s.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}