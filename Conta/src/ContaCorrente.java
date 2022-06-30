public class ContaCorrente implements Conta {

    public double saldo = 900.00 - 0.45;
    

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }
    
}
