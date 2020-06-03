package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button generalPage;

    @FXML
    private Button calcPage;

    @FXML
    private Button literalPage;

    @FXML
    void initialize() {
        generalPage.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("sample.fxml"));

            try {
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));

            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calcPage.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("testirovanie.fxml"));

            try {
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));

            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
}
