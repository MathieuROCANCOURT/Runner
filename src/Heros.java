import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.jetbrains.annotations.NotNull;

public class Heros {
    public Integer x,y;
    public ImageView im;

    public Heros(Integer x, Integer y, ImageView im) {
        this.x = x;
        this.y = y;
        this.im = im;
    }

    protected Integer getX() {
        return x;
    }

    protected Integer getY() {
        return y;
    }

    public ImageView getIm(){
        return im;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setIm(ImageView im) {
        this.im = im;
    }

    public void updateViewHerosImage(Camera camera, long l){
        getIm().setX(x-camera.getX());
        getIm().setY(y-camera.getY());

        camera.setX(getX()+camera.getX());
        camera.setY(getY()+camera.getY());

        int index = (int) (((l/1e6)/250) % 6);
    }
}
