package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class ControllerTest {

    boolean answer1a;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Back;

    @FXML
    private CheckBox question2a;

    @FXML
    private CheckBox question2b;

    @FXML
    private CheckBox question2c;

    @FXML
    private CheckBox question3a;

    @FXML
    private CheckBox question3b;

    @FXML
    private CheckBox question3c;

    @FXML
    private Button check;

    @FXML
    private CheckBox question1a;

    @FXML
    private CheckBox question1b;

    @FXML
    private CheckBox question1c;

    @FXML
    void initialize() {
        Back.setOnAction(event -> {
            Back.getScene().getWindow().hide();

            FXMLLoader loaderOne = new FXMLLoader();
            loaderOne.setLocation(getClass().getResource("sample.fxml"));

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
        if(question1a.isSelected()){
            answer1a = true;
        }
        check.setOnAction(event -> {
            check.getScene().getWindow().hide();

            FXMLLoader loaderCheck = new FXMLLoader();
            loaderCheck.setLocation(getClass().getResource("/sample/sample.fxml"));

            try {
                loaderCheck.load();
                Parent rootCheck = loaderCheck.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(rootCheck));
                stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
}
