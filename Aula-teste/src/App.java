public class App {
    public static void main(String[] args) {
            
            Pessoa pessoa = new Pessoa();
            pessoa.setNome("João P.");
            pessoa.setIdade(21);
            
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getIdade());
    }
}
