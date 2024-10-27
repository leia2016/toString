public class ContaBancaria {
    private String numero;
    private String titular;
    private float saldo;


    public ContaBancaria() {
        this.numero = "";
        this.titular = "";
        this.saldo = 0;
    }


    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0; // Inicia com saldo zero
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor do depósito deve ser positivo.");
        }
    }

    public void sacar(float valor) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Valor do saque deve ser positivo.");
        }
    }

    public float consultarSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "número='" + numero + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

