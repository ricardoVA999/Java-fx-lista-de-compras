package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import sample.Clases.Item;

public class NuevoArticuloController {
    //Derle identidad a las diferentes partes del fxml
    @FXML
    TextField Nombre;

    @FXML
    TextField Cantidad;

    @FXML
    TextField Precio;

    @FXML
    Button button1;

    @FXML
    Button button2;

    @FXML
    //Abrir Lista Del Super sin crear un item
    public void OpenListaDelSuper(ActionEvent event){
        Stage stage1 = (Stage) button1.getScene().getWindow();
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
    //Abrir Lista Del Super creando un iteam
    public void OpenListaDelSuperyCrear(ActionEvent event){
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
            String nombre = Nombre.getText();
            int cantidad = Integer.parseInt(Cantidad.getText());
            double precio = Double.parseDouble(Precio.getText());
            Item miitem = new Item(nombre, cantidad, precio);
        } catch (Exception e){
            System.out.println("Nel");
        }
    }
}
