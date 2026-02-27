package builder;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido.Builder()
                .conPlatoPrincipal("Sushi California Roll")
                .conEntrada("Empanadas con aji")
                .conBebida("Limonada de coco")
                .conPostre("Torta de maracumango")
                .conObservaciones("El aji mas picante que tengan y el sushi sin estar crudo")
                .build();

        System.out.println(p1);

        Pedido p2 = new Pedido.Builder()
                .conPlatoPrincipal("Sancocho Trifasico")
                .build();
        System.out.println(p2);

        try {
            Pedido p3 = new Pedido.Builder().conBebida("Media de Ron Viejo de Caldas").build();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
