package sample.Clases;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Listota {
    private SimpleStringProperty nombre;
    private SimpleStringProperty fecha;
    private SimpleIntegerProperty pendientes;
    private SimpleDoubleProperty estimado;

    public Listota(String nombre, String fecha, int pendientes, double estimado){
        this.nombre = new SimpleStringProperty();
        this.fecha = new SimpleStringProperty();
        this.pendientes = new SimpleIntegerProperty();
        this.estimado = new SimpleDoubleProperty();

        this.nombre.set(nombre);
        this.estimado.set(estimado);
        this.pendientes.set(pendientes);
        this.fecha.set(fecha);
    }
}
