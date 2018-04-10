package w18comp1008w12prep;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class WarmUpViewController implements Initializable
{

    @FXML
    private ImageView imageView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        Image image = new Image("JW2.jpg");
        imageView.setImage(image);

        // set a clip to apply rounded border to the original image.
        Rectangle clip = new Rectangle(
                imageView.getFitWidth(), imageView.getFitHeight()
        );
        clip.setArcWidth(60);
        clip.setArcHeight(60);
        imageView.setClip(clip);
        
    }

}
