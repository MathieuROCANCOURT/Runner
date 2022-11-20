import View.Heros;
import View.ViewManager;
import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {
    // Créer un nouveau caméra
    Camera action = new Camera(0, 0);
    // Initialisation du background
    Image background1 = new Image("file:./desert.png", true);

    // Initialisation de l'image du personnage
    ImageView sprite = new ImageView(new Image("file:./img/heros.png"));
    ViewManager view = new ViewManager();
    // Créer le personnage
    Heros personnage = new Heros(400, 200, sprite);

    TranslateTransition transition = new TranslateTransition();

    AnimationTimer Update = new AnimationTimer() {
        @Override
        public void handle(long l) {
            // Update Image view
            personnage.updateViewHerosImage(l);

            view.moveBackground(personnage);

            transition.setByX(-3);
            transition.setDuration(Duration.millis(20));
            transition.setNode(view.getAnchorPane());
            transition.play();

        }
    };


    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            // Image Héros
            // Rectangle2D(minX, minY, width, height)
            sprite.setViewport(new Rectangle2D(20, 0, 65, 100));
            view.getAnchorPane().getChildren().add(sprite);

            // Modifier position du personnage
            sprite.setX(20);
            sprite.setY(250);

            // Titre de la fenêtre
            primaryStage.setTitle("Game");


            // Affichage scene
            primaryStage.setScene(view.getScene());

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