package Classe;

public class Main {
    public static void main(String[] args) {
        
        Cliente Guilherme = new Cliente();
        Guilherme.setNome("Guilherme");
        
        Conta cc = new ContaCorrente(Guilherme);
        Conta poupanca = new ContaPoupanca(Guilherme);
        
        cc.transferir(100, poupanca);
        cc.depositar(100);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}