package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.*;
import javafx.event.ActionEvent;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    public void OpenNuevaLista(ActionEvent event){
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
