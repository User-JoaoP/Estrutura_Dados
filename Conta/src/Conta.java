interface Conta{
    abstract void depositar(double valor);
    abstract void sacar(double valor);
    abstract double getSaldo();
}