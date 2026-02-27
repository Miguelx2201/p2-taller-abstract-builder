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

    @Override
    public String toString() {
        return "Pedido{" +
                "platoPrincipal='" + platoPrincipal + '\'' +
                ", entrada='" + entrada + '\'' +
                ", postre='" + postre + '\'' +
                ", bebida='" + bebida + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }

    public static class Builder {
        private String platoPrincipal;
        private String entrada;
        private String postre;
        private String bebida;
        private String observaciones;

        public Builder conPlatoPrincipal(String platoPrincipal) {
            this.platoPrincipal = platoPrincipal;
            return this;
        }
        public Builder conEntrada(String entrada) {
            this.entrada = entrada;
            return this;
        }
        public Builder conPostre(String postre) {
            this.postre = postre;
            return this;
        }
        public Builder conBebida(String bebida) {
            this.bebida = bebida;
            return this;
        }
        public Builder conObservaciones(String observaciones) {
            this.observaciones = observaciones;
            return this;
        }
        public Pedido build() {
            if(platoPrincipal == null) throw new IllegalStateException("Plato principal no puede ser nulo.");
            return new Pedido(this);
        }
    }
}
