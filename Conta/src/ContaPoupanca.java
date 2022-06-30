public class ContaPoupanca implements Conta{

    public double saldo2 = 700.00;
    

    @Override
    public void depositar(double valor) {
        this.saldo2 += valor;
        
    }

    @Override
    public void sacar(double valor) {
        this.saldo2 -= valor;
        
    }

    @Override
    public double getSaldo() {
        return this.saldo2;
    }
}