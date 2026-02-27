package abstract_factory;

public interface IngredientesFactory {
    Salsa crearSalsa();
    Queso crearQueso();
    Masa crearMasa();
}
