import cocina.*;
import despensa.Despensa;
import ingredientes.Ingrediente;
import recetas.*;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("Auguste Gusteau", 5);

        //Recetas
        HuevoDuro huevoDuro = new HuevoDuro();
        Pizza pizza = new Pizza();
        Omelette omelette = new Omelette();

        //Ingredientes
        Ingrediente huevo = new Ingrediente("Huevo", 1);
        Ingrediente agua = new Ingrediente("Agua", 100);
        Ingrediente masaDePizza = new Ingrediente("Masa de pizza", 1);
        Ingrediente salsaDeTomate = new Ingrediente("Salsa de tomate", 100); 
        Ingrediente quesoMozarella = new Ingrediente("Queso mozzarella", 150); 
        Ingrediente jamon = new Ingrediente("Jamón", 100);
        Ingrediente queso = new Ingrediente("Queso", 50);
        Ingrediente tomate = new Ingrediente("Tomate", 1);
        
        //Despensa
        Despensa despensa = new Despensa(8);
        despensa.addIngrediente(huevo);
        despensa.addIngrediente(agua);
        despensa.addIngrediente(masaDePizza);
        despensa.addIngrediente(salsaDeTomate);
        despensa.addIngrediente(quesoMozarella);
        despensa.addIngrediente(jamon);
        despensa.addIngrediente(queso);
        despensa.addIngrediente(tomate);


        //Cocinar
        CocinaService cocinar = new CocinaService();
        
        cocinar.cocinar(chef, huevoDuro, despensa);
        cocinar.cocinar(chef, pizza, despensa);
        cocinar.cocinar(chef, omelette, despensa);
        cocinar.cocinar(chef, huevoDuro, despensa);
    }
}
