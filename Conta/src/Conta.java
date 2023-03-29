public class Conta {
    private int numeroConta;
    private String nome;
    private double saldo;

    public Conta(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = 0;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getnome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public void sacar(double saldo) {
        this.saldo -= saldo;
    }

    @Override
    public String toString() {
        return "Conta [numeroConta=" + numeroConta + ", nome=" + nome + ", saldo=" + saldo + "]";
    }

}
