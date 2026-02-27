package builder;

public class Pedido {
    private String platoPrincipal;
    private String entrada;
    private String postre;
    private String bebida;
    private String observaciones;

    private Pedido(Builder b) {
        this.platoPrincipal = b.platoPrincipal;
        this.entrada = b.entrada;
        this.postre = b.postre;
        this.bebida = b.bebida;
        this.observaciones = b.observaciones;
    }
}
