public class Quadrado extends Retangulo {

    @Override
    double calcularArea() {
        double area;
        area = getLado()*getLado();
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro;
        perimetro=(getLado()*4);
        return perimetro;
    }

    
}
