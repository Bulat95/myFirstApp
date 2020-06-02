package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
            generalPage.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("app.fxml"));

            try {
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        calcPage.setOnAction(event -> {
            calcPage.getScene().getWindow().hide();
            FXMLLoader loaderTest = new FXMLLoader();
            loaderTest.setLocation(getClass().getResource("testirovanie.fxml"));

            try {
                loaderTest.load();
                Parent rootTest = loaderTest.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(rootTest));
                stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
}
