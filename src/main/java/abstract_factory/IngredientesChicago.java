package abstract_factory;

public class IngredientesChicago implements IngredientesFactory{

    public Salsa crearSalsa(){
        return new SalsaBBQ();
    }

    public Queso crearQueso(){
        return new QuesoCheddar();
    }
    public Masa crearMasa(){
        return new MasaGruesa();
    }
}
