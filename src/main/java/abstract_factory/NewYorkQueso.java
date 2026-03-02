package abstract_factory;

public class NewYorkQueso implements Queso{
    public String descripcion() {
        System.out.println("Queso Mozzarella");
    }
    public double precio() {
        return 3;
    }
}
