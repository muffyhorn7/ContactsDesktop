package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Main extends Application {

    public static final String FILE_LOCATION= "contacts.json";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller.loadContacts(FILE_LOCATION);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Contacts Desktop");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) throws FileNotFoundException
    {
        launch(args);
    }
}
