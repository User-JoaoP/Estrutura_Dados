public class Circulo extends Forma{
    
    private double diametro; 
   
   
    public double getRaio() {
        return diametro;
    }

    public void setRaio(double raio) {
        this.diametro = raio;
    }

    @Override
    double calcularArea() {
        diametro /= 2;
        double area = Math.PI * Math.pow(diametro, 2);
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = 2 * Math.PI * diametro;
        return perimetro;
    }
    
}
