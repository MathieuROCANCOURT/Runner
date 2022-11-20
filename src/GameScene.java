import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameScene{
    //private static final Scene Scene = new Scene(new Pane(new Group()), 600, 400,true);
    Stage s;

    public GameScene( Stage s) {
        this.s = s;
    }

    public Stage getS() {
        return s;
    }
}
