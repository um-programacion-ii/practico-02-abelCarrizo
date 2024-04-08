package recetas;

import ingredientes.Ingrediente;

public class Omelette extends Receta {
    public Omelette() {
        super(15, new Ingrediente[]{new Ingrediente("Huevo", 2), new Ingrediente("Queso", 50), new Ingrediente("Tomate", 1)}, "Batir los huevos, agregar el queso y el tomate cortado en cubitos, cocinar a fuego medio hasta que esté dorado por ambos lados.");
    }
    
    public String toString() {
        return "OMELETTE\n" + super.toString();
    }
}
