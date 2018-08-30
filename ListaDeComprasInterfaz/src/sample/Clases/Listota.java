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

    public String getNombre() {
        return nombre.get();
    }

    public String getFecha() {
        return fecha.get();
    }

    public int getPendientes() {
        return pendientes.get();
    }

    public double getEstimado() {
        return estimado.get();
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public void setFecha(String fecha) {
        this.fecha.set(fecha);
    }

    public void setPendientes(int pendientes) {
        this.pendientes.set(pendientes);
    }

    public void setEstimado(double estimado) {
        this.estimado.set(estimado);
    }
}
