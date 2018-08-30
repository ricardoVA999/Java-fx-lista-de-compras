package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import sample.Clases.Item;

public class ListaDelSuperController {
    //Derle identidad a las diferentes partes del fxml
    @FXML
    TableView<Item> myListTableView;

    @FXML
    TableColumn articuloColumn;

    @FXML
    TableColumn cantidadolumn;

    @FXML
    TableColumn unitarioColumn;

    @FXML
    TableColumn totalColumn;

    @FXML
    TableColumn estadoColumn;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    //Abrir la ventana Nuevo Articulo
    public void OpenNuevoArticulo(ActionEvent event){
        Stage stage1 = (Stage) button2.getScene().getWindow();
        stage1.close();
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
    //Abrir la ventana Sample
    public void Opensample(ActionEvent event){
        Stage stage1 = (Stage) button1.getScene().getWindow();
        stage1.close();
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
