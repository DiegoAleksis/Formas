public abstract class Rectangulo extends Figura{
    public double alto;
    public double ancho;

    public Rectangulo(String color, boolean relleno, double alto, double ancho) {
        super(color, relleno);
        this.alto = alto;
        this.ancho = ancho;
    }
}
