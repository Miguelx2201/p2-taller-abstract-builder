package abstract_factory;

public class NewYorkMasa implements Masa{
    public String descripcion() {
        System.out.println("Queso Mozzarella");
    }
    public double precio() {
        return 3;
    }
}
