package sample.Clases;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

//Crear la clase Item
public class Item {
    SimpleStringProperty nombre;
    SimpleIntegerProperty cantidad;
    SimpleDoubleProperty precio;
    SimpleBooleanProperty estado;

    //LLamar a las instancias de un objeto
    public Item(String nombre, int cantidad, double precio){
        this.nombre = new SimpleStringProperty();
        this.cantidad = new SimpleIntegerProperty();
        this.precio = new SimpleDoubleProperty();
        this.estado = new SimpleBooleanProperty();

        this.nombre.set(nombre);
        this.cantidad.set(cantidad);
        this.precio.set(precio);
        this.estado.set(false);
    }

    //Metodos Importantes de la clase, setters y getters
    public String getNombre() {
        return this.nombre.get();
    }
    public void setNombre(String fName) {
        this.nombre.set(fName);
    }
    public int getCantidad() {
        return this.cantidad.get();
    }
    public void setCantidad(int fcantidad) {
        this.cantidad.set(fcantidad);
    }
    public double getPrecio() {
        return this.precio.get();
    }
    public void setNombre(double fPrecio) {
        this.precio.set(fPrecio);
    }
    public Boolean getEstado() {
        return this.estado.get();
    }
    public void setEstado(Boolean fEstado) {
        this.estado.set(fEstado);
    }
}
