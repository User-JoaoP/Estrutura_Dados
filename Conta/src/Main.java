import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ContaCorrente corrente = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();
        
        System.out.println("-------------Conta corrente-------------");
        System.out.print("Quanto quer depositar na conta corrente?: ");
        corrente.depositar(scan.nextDouble());
        System.out.println("Quanto quer sacar da conta corrente?: ");
        corrente.sacar(scan.nextDouble());
        
        System.out.println("\n-------------Conta poupança-------------");
        System.out.print("Quanto quer depositar na conta poupança?: ");
        poupanca.depositar(scan.nextDouble());
        System.out.print("Quanto quer sacar da conta poupança?: ");
        poupanca.sacar(scan.nextDouble());

         

        System.out.println("\nO saldo da conta corrente é: " + corrente.getSaldo());
        System.out.println("O saldo da conta poupança é: " + poupanca.getSaldo());
        scan.close();
    }
}
