package abstract_factory;

public class Pizza {
    private Salsa salsa;
    private Queso queso;
    private Masa masa;

    public Pizza(IngredientesFactory f){
        salsa = f.crearSalsa();
        queso = f.crearQueso();
        masa = f.crearMasa();

    }

    public void mostrarIngredientes() {
        System.out.println("  Salsa : " + salsa.descripcion() + " ($" + salsa.precio() + ")");
        System.out.println("  Queso : " + queso.descripcion() + " ($" + queso.precio() + ")");
        System.out.println("  Masa  : " + masa.descripcion()  + " ($" + masa.precio()  + ")");
    }

    public double precioTotal() {
        return salsa.precio() + queso.precio() + masa.precio();
    }

}
