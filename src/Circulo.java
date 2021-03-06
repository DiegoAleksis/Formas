public abstract class Circulo extends Figura {


    public Circulo(String color, boolean relleno) {
        super(color, relleno);
    }
    private double radio;

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public  float calcularArea(){
        return ( float ) ( Math . PI * Math . pow ( radio , 2 ));
    }

}


