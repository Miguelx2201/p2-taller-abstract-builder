package abstract_factory;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Pizza NEW YORK =====");
        Pizza pizzaNY = new Pizza(new IngredientesNY());
        pizzaNY.mostrarIngredientes();
        System.out.println("  Precio total: $" + pizzaNY.precioTotal());

        System.out.println("===== Pizza CHICAGO =====");
        Pizza pizzaChicago = new Pizza(new IngredientesChicago());
        pizzaChicago.mostrarIngredientes();
        System.out.println("  Precio total: $" + pizzaChicago.precioTotal());
    }

}
