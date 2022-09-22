package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.net.URL;

public class App extends Application {
    private Stage window;
    @Override
    public void start(Stage stage) throws Exception {
        URL file = new File("C:\\Users\\acer\\Desktop\\projetPerso\\simpleTextEditeur\\src\\main\\java\\View\\editorView.fxml").toURI().toURL();
        Parent root  = FXMLLoader.load(file);
        stage.setTitle("Editeur TEXT");
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(new Scene(root , Color.TRANSPARENT));
        stage.show();


    }

    public  Stage getWindow(){
        return this.window;
    }
}


