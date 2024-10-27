public class TestaContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("123456", "Marileia");


        System.out.println(conta);


        conta.depositar(1000);
        System.out.println("Saldo após depósito: " + conta.consultarSaldo());


        conta.sacar(200);
        System.out.println("Saldo após saque: " + conta.consultarSaldo());


        conta.sacar(900);
        System.out.println("Saldo após tentativa de saque: " + conta.consultarSaldo());


        conta.depositar(-50);
    }
}