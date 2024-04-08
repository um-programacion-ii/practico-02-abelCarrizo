package cocina;

import despensa.Despensa;
import ingredientes.Ingrediente;
import recetas.*;

public class CocinaService {

    public CocinaService() {}

    public boolean cocinar(Chef chef, Receta receta, Despensa despensa) {
        System.out.println("\n------");
        System.out.println("El Chef: " + chef.getNombre() + " preparará la receta...");
        System.out.println(receta);

        int ingredientesNecesarios = receta.getIngredientes().length; //Si se encuentran todos los ingredientes su valor es 0

        for (Ingrediente ingrediente : receta.getIngredientes()) {
            int cantIngredienteDespensa = despensa.getIngrediente(ingrediente.getNombre());
            int cantIngredienteReceta = ingrediente.getCantidad();
            
            if (cantIngredienteDespensa > 0 && cantIngredienteDespensa >= cantIngredienteReceta){
                --ingredientesNecesarios;
                despensa.setIngrediente(ingrediente, cantIngredienteReceta);
                System.out.println("Ingrediente [" + ingrediente.getNombre() + "] en Despensa disponible despues de su uso:" + despensa.getIngrediente(ingrediente.getNombre()));

            } else {
                int cantidadFaltante = cantIngredienteReceta - cantIngredienteDespensa;
                System.out.println("Al ingrediente: [" + ingrediente.getNombre() + "] le faltan: " + cantidadFaltante);
            }
        }

        if (ingredientesNecesarios != 0) {
            System.out.println("La receta no se puede realizar debido a la falta de ingredientes!");
            return false;
        }
        System.out.println("RECETA REALIZADA CON EXITO");
        System.out.println("------");

        return true;
    }
}
