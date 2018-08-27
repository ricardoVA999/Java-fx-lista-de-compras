package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    public void Openwindow(ActionEvent event){
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NuevaLista.fxml"));
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Nueva Lista");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e){
            System.out.println("Cant load new window");
        }
    }
}
