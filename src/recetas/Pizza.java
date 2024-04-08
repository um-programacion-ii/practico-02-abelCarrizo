package recetas;

import ingredientes.Ingrediente;

public class Pizza extends Receta {
    public Pizza() {
        super(30, new Ingrediente[]{new Ingrediente("Masa de pizza", 1), new Ingrediente("Salsa de tomate", 100), new Ingrediente("Queso mozzarella", 150), new Ingrediente("Jamón", 100)}, "Extender la masa, agregar salsa de tomate, queso, jamón y champiñones. Hornear durante 30 minutos.");
    }

    public String toString() {
        return "PIZZA\n" + super.toString();
    }
}