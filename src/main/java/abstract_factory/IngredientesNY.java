package abstract_factory;

public class IngredientesNY implements IngredientesFactory{
    public Salsa crearSalsa(){
        return new SalsaTomate();
    }

    public Queso crearQueso(){
        return new QuesoMozzarella();
    }
    public Masa crearMasa(){
        return new MasaFina();
    }
}
