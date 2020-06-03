package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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

    public class Test {
        void setMethod (String string){
            ControllerCheck controllerCheck = new ControllerCheck();
            controllerCheck.str = string;
        }
    }

    public String str = "hello";


    private StringProperty yourResult = new SimpleStringProperty(str);


    public String getStr()
    {
        return yourResult.get();
    }

    public void setStr(String newValue)
    {
        this.str = newValue;
    }

    @FXML
    void initialize() {

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

    }
}
