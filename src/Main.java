import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class Main extends Application {
    // Créer un nouveau caméra
    Camera action = new Camera(800, 400);

    // Initialisation de l'image du personnage
    ImageView sprite = new ImageView(new Image("file:./img/heros.png"));
    // Créer le personnage
    Heros personnage = new Heros(400, 200, sprite);

    AnimationTimer Update = new AnimationTimer() {
        @Override
        public void handle(long l) {
            // Update Image view
            //personnage.updateViewHerosImage(action, l);
            //System.out.println(action.toString());

        }
    };


    @Override
    public void start(Stage primaryStage) throws Exception{
        try {

            Group root = new Group();
            Pane pane = new Pane(root);
            Scene theScene = new Scene(pane, 600, 400, true);

            // Image Héros
            // Rectangle2D(minX, minY, width, height)
            sprite.setViewport(new Rectangle2D(20, 0, 65, 100));
            root.getChildren().add(sprite);

            // Modifier position du personnage
            sprite.setX(10);
            sprite.setY(50);

            // Titre de la fenêtre
            primaryStage.setTitle("Game");


            // Affichage scene
            pane.getStylesheets().add("style.css");
            primaryStage.setScene(theScene);

            primaryStage.show();
            Update.start();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}