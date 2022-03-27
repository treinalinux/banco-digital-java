public class Main {
    public static void main(String[] args) {
        Cliente alan = new Cliente();
        alan.setNome("Alan");

        Conta cc = new ContaCorrente(alan);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(alan);
        cc.transferir(100,poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
