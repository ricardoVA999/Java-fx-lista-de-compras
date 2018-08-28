package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class ListaDelSuperController {
    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    public void OpenNuevoArticulo(ActionEvent event){
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NuevoArticulo.fxml"));
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Nuevo Articulo");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e){
            System.out.println("Cant load new window");
        }
    }
    public void Opensample(ActionEvent event){
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Lista de compra");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e){
            System.out.println("Cant load new window");
        }
    }
}
