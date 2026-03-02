package abstract_factory;

public class IngredientesNY implements IngredientesFactory{
    @Override
    public Salsa crearSalsa() {
        return new NewYorkSalsa();
    }

    @Override
    public Queso crearQueso() {
        return new NewYorkQueso();
    }

    @Override
    public Masa crearMasa() {
        return new NewYorkMasa();
    }
}
