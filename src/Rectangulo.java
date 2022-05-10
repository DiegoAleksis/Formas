public abstract class Rectangulo extends Figura{
    public double alto;
    public double ancho;

    public Rectangulo(String color, boolean relleno, double alto, double ancho) {
        super(color, relleno);
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
