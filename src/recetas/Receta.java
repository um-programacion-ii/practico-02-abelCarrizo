package recetas;

import ingredientes.Ingrediente;

public class Receta {
    protected int tiempoCoccion;
    protected Ingrediente[] ingredientes;
    protected String preparacion;

    public Receta(int tiempoCoccion, Ingrediente[] ingredientes, String preparacion){
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public Ingrediente[] getIngredientes(){
        return this.ingredientes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Receta:\n");
        sb.append("Tiempo de Cocción: ").append(this.tiempoCoccion).append(" minutos\n");
        sb.append("Ingredientes:\n");
        for (Ingrediente ingrediente : this.ingredientes) {
            sb.append("- ").append(ingrediente).append("\n");
        }
        sb.append("Preparación: ").append(preparacion).append("\n");
        return sb.toString();
    }
}
