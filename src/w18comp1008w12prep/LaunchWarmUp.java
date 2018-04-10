package w18comp1008w12prep;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class LaunchWarmUp extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("WarmUpView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Warm Up");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
