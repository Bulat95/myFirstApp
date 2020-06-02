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

public class ControllerCheck {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Back;

    @FXML
    void initialize() {
        Back.setOnAction(event -> {
            Back.getScene().getWindow().hide();

            FXMLLoader loaderOne = new FXMLLoader();
            loaderOne.setLocation(getClass().getResource("testirovanie.fxml"));

            try {
                loaderOne.load();
                Parent rootRT = loaderOne.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(rootRT));
                stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

    }
}
