import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent loader = FXMLLoader.load(getClass().getResource("fxtest.fxml"));
        Scene scene = new Scene(loader);
        primaryStage.setTitle("Project java Web Browser");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}

