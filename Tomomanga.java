public class Tomomanga {
    String tituloObra;
    int numeroVolumen;
    double precio;
    boolean leido;

    public Tomomanga(String tituloObra, int numeroVolumen, double precio) {
        this.tituloObra = tituloObra;
        if (numeroVolumen < 0) {
            this.numeroVolumen = 0;
        } else {
            this.numeroVolumen = numeroVolumen;
        }
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }
        this.leido = false;
    }

    public void marcarComoLeido() {
        leido = true;
    }

    public void estadoLectura() {
        if (leido) {
            System.out.println("estado finalizado");
        } else {
            System.out.println("estado pendiente");
        }
    }
}
