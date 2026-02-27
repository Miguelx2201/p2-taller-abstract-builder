package abstract_factory;

public class NewYorkMasa implements Masa{
    public void descripcion() {
        System.out.println("Masa fina");
    }
    public double precio() {
        return 3;
    }
}
