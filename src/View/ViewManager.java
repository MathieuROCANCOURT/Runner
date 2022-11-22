package View;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ViewManager {
    private static final int HEIGHT = 400;
    private static final int WIDTH = 1200;
    private AnchorPane anchorPane;
    private Stage stage;
    private Scene scene;

    private GridPane gridPane;
    private GridPane gridPane1;
    private GridPane gridPane2;
    private static final String BACKGROUND_PATH = "file:./img/desert.png";

    private static int i = 1;

    public ViewManager(){
        initializeStage();
    }

    private void initializeStage(){
        anchorPane = new AnchorPane();
        scene = new Scene(anchorPane, WIDTH, HEIGHT);
        stage = new Stage();
        stage.setScene(scene);
        createBackground();
    }

    public AnchorPane getAnchorPane() {
        return anchorPane;
    }

    public Scene getScene() {
        return scene;
    }

    public Stage getStage() {
        return stage;
    }

    public void createBackground() {
        gridPane = new GridPane();
        gridPane1 = new GridPane();
        gridPane2 = new GridPane();
        gridPane.getChildren().add(new ImageView(BACKGROUND_PATH));
        gridPane1.getChildren().add(new ImageView(BACKGROUND_PATH));
        gridPane2.getChildren().add(new ImageView(BACKGROUND_PATH));
        gridPane1.setTranslateX(800);
        gridPane2.setTranslateX(800*2);

        anchorPane.getChildren().addAll(gridPane, gridPane1, gridPane2);
        anchorPane.setTranslateX(-1);

    }

    public void moveBackground(Heros heros){
        if ((heros.getSprite().getX() >= i* 1200 + 500*(i-1))){
            if ((i%3) == 1) {
                gridPane.setTranslateX((int) gridPane.getTranslateX() + 800*3);
            } else if ((i%3 == 2)) {
                gridPane1.setTranslateX((int) gridPane1.getTranslateX() + 800*3);
            } else {
                gridPane2.setTranslateX((int) gridPane2.getTranslateX() + 800*3);
            }
            i++;
        }
    }
}
