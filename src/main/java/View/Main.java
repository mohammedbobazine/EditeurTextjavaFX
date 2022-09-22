package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main  extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("editorView.fxml"));
        Parent root = fxmlLoader.load();
        stage.setTitle("editeur de text");
        stage.setScene(new Scene(root, 700 , 500));
        stage.show();

    }
    public static void main(String[]args){
        launch(args);
    }
}
