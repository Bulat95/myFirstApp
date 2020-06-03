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
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class ControllerTest {

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


    public String string;

    @FXML
    void initialize() {
        if(question1a.isSelected()){
            string = "вы сдали!";
            Test test = new Test();
            test.setMethod(string);
        }
        else{
            Test test = new Test();
            test.setMethod(string);
            string = "вы не сдали!";}

        Back.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("app.fxml"));

            try {
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));

            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        check.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("check.fxml"));

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
