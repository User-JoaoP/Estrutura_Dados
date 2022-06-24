public class Retangulo extends Forma {
    private double base, lado;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        double area;
        area = getLado()*getBase();
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro;
        perimetro=(getLado()*2) + getBase()*2;
        return perimetro;
    }

    
}
