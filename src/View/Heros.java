package View;

import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import org.jetbrains.annotations.NotNull;

public class Heros {
    public Integer x,y;
    public ImageView sprite;

    public Heros(Integer x, Integer y, ImageView sprite) {
        this.x = x;
        this.y = y;
        this.sprite = sprite;
    }

    protected Integer getX() {
        return x;
    }

    protected Integer getY() {
        return y;
    }

    public ImageView getSprite(){
        return sprite;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setSprite(ImageView sprite) {
        this.sprite = sprite;
    }

    public void updateViewHerosImage(long l){
        TranslateTransition transition = new TranslateTransition();

        int index = (int) (l/1.5e8) % 6;
        getSprite().setViewport(new Rectangle2D(85*index, 0, 80, 100));

        getSprite().setX(getSprite().getX() + 3);

        transition.setByX(-2);
        transition.setDuration(Duration.millis(30));
        transition.setNode(getSprite());
        transition.play();


        /*int index2 = (int) (l/1e8) % 2;
        System.out.println(index2);
        getSprite().setViewport(new Rectangle2D(85*index2, 150, 80, 100));

        transition2.setByY(3);
        transition2.setDuration(Duration.millis(30));
        transition2.setNode(getSprite());
        transition2.play();

        transition3.setByY(-3);
        transition3.setDuration(Duration.millis(30));
        transition3.setNode(getSprite());
        transition2.stop();
        transition3.play();*/

    }
}
