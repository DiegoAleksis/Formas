public abstract class Figura {
    private String color;
    private boolean relleno;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;



    }
}
