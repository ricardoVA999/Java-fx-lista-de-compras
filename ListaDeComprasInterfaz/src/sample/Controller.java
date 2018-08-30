package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import sample.Clases.ListaDeItems;

public class Controller {
    //Derle identidad a las diferentes partes del fxml
    @FXML
    TableView<ListaDeItems> myListTableView;

    @FXML
    TableColumn nombreColumn;

    @FXML
    TableColumn fechaColumn;

    @FXML
    TableColumn pendienteColumn;

    @FXML
    TableColumn estimadoColumn;

    @FXML
    private Button button2;

    @FXML
    private Button button1;

    @FXML
    //Funcion para abrir la Ventana Nueva Lista
    public void OpenNuevaLista(ActionEvent event){
        Stage stage1 = (Stage) button1.getScene().getWindow();
        stage1.close();
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
    //Funcion para abrir la ventana Lista del super
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
            System.out.println("Cant load new window");
        }
    }
}
