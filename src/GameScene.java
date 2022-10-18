import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene{
    private static final Parent Parent = new Parent() {};
    Camera c;
    
    protected GameScene(Camera c){
        super(Parent);
        this.c = c;
    }
}
