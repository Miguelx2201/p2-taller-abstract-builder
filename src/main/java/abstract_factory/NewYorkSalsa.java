package abstract_factory;

public class NewYorkSalsa implements  Salsa {
    public void descripcion() {
        System.out.println("Salsa de tomate");
    }
    public double precio() {
        return 2;
    }
}
