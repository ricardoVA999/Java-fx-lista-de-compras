package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class NuevoArticuloController {
    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    public void OpenListaDelSuper(ActionEvent event){
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListaDelSuper.fxml"));
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Lista del super");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e){
            System.out.println("Cant load new window");
        }
    }
}
