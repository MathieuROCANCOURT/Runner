import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GameScene extends Scene{
    private static final Scene Scene = new Scene(new Pane(new Group()), 600, 400,true);
    Camera c;
    
    public GameScene(Camera c){
        super(Scene.getRoot());
        this.c = c;
    }

    public Camera getC() {
        return c;
    }



}
