package cocina;

public class Chef {
    private String nombre;
    private int estrellasMichelin;

    public Chef(String nombre, int estrellasMichelin) {
        this.nombre = nombre;
        this.estrellasMichelin = estrellasMichelin;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrellasMichelin() {
        return this.estrellasMichelin;
    }

    public void setEstrellasMichelin(int estrellasMichelin) {
        this.estrellasMichelin = estrellasMichelin;
    }

    @Override
    public String toString() {
        return "Chef: " + this.nombre + " | Estrellas: " + this.estrellasMichelin;
    }
}