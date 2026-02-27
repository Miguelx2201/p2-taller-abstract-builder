package abstract_factory;

public class NewYorkQueso implements Queso{
    public void descripcion() {
        System.out.println("Queso Mozzarella");
    }
    public double precio() {
        return 3;
    }
}
