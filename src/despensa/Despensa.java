package despensa;

import ingredientes.Ingrediente;

public class Despensa {
    private Ingrediente[] ingredientes;
    public static int contador;

    public Despensa(int capacidad){
        this.ingredientes = new Ingrediente[capacidad];
    }

    public void addIngrediente(Ingrediente ingrediente) {
        this.ingredientes[Despensa.contador++] = ingrediente;
    }

    public int getIngrediente(String nombre) {
        for (Ingrediente ingrediente : this.ingredientes) {
            if (ingrediente.getNombre() == nombre) {
                return ingrediente.getCantidad();
            }
        }
        return 0;
    }

    public void setIngrediente(Ingrediente ingrediente, int cantidad) {
        for (Ingrediente i : this.ingredientes) {
            if (i.getNombre() == ingrediente.getNombre()) {
                int restante = i.getCantidad() - cantidad;
                i.setCantidad(restante);
            }
        }
    }
}