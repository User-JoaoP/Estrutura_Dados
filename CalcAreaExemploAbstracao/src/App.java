import java.util.Scanner;

public class App{
    public static void main(String[] args){
        
        Scanner dados = new Scanner(System.in);
        
        //Recebe lado e base do retangulo e imprime sua area e base.
        Retangulo ret=new Retangulo();
            System.out.println("Retangulo");
            System.out.print("Digite o lado: ");
            ret.setLado(dados.nextDouble());
            System.out.print("Digite a base: ");
            ret.setBase(dados.nextDouble());
            System.out.println("Area " + ret.calcularArea());
            System.out.println("Perímetro " + ret.calcularPerimetro());
        
        //Recebe lado do quadrado e imprime sua area e perimetro.
        Quadrado quad=new Quadrado();
            System.out.println("\nQuadrado");
            System.out.print("Digite o lado: ");
            quad.setLado(dados.nextDouble());       
            System.out.println("Area " + quad.calcularArea());
            System.out.println("Perímetro " + quad.calcularPerimetro());

        //Recebe o diametro do circulo e imprime sua area e circunferência.
        Circulo circ = new Circulo();
            System.out.println("\nCirculo");
            System.out.print("Digite o diametro: ");
            circ.setRaio(dados.nextDouble());
            System.out.printf("Area %.2f\n", circ.calcularArea());
            System.out.printf("Circunferência %.2f", circ.calcularPerimetro());
            dados.close();
    }
}
