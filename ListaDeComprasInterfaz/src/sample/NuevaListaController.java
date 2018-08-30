package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class NuevaListaController {
    //Derle identidad a las diferentes partes del fxml
    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private TextField Nombre;

    @FXML
    private TextArea Descripcion;

    @FXML
    //Abrir Lista Del Super
    public void OpenListaDelSuper(ActionEvent event){
        Stage stage1 = (Stage) button2.getScene().getWindow();
        stage1.close();
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListaDelSuper.fxml"));
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Lista del super");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e){
            System.out.println("Nel");
        }
    }
    //Abrir Sample
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
            System.out.println("Nel");
        }
    }
}
