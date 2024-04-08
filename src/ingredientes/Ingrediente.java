package ingredientes;

public class Ingrediente {
    private String nombre;
    private int cantidad;

    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    //Nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Cantidad
    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Metodo que disminuye la cantidad de un ingrediente
    public boolean sacar(int cantidad) {
        if(cantidad > this.cantidad) {
            return false;
        }
        this.cantidad -= cantidad;
        return true;
    }

    @Override
    public String toString() {
        return this.nombre + " | " + "cantidad: " + this.cantidad;
    }
}
