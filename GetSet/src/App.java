import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Definindo as variáveis da classe "Pessoa" manualmente.
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João Pedro");
        pessoa.setAltura(1.7);
        pessoa.setIdade(21);

        //Aqui utilizo um método de entrada para definir as variáveis da classe "Cachorro"
        Cachorro cachorro = new Cachorro();
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome do cachorro?");
        cachorro.nome = scan.nextLine();
        System.out.println("Qual o tamanho dele?");
        cachorro.tamanho = scan.nextFloat();
        System.out.println("Qual a idade dele?");
        cachorro.idade = scan.nextInt();
        scan.close();

        //Saída das variaveis da classe "Pessoa"
        System.out.println("-----------------------------");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("-----------------------------");

        //Saída das variaveis da classe "Cachorro"
        System.out.println("-----------------------------");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Tamanho: " + cachorro.getTamanho());
        System.out.println("Idade: " + cachorro.getIdade());        
        System.out.println("-----------------------------");
    }
}
