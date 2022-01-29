
public class Main {

	public static void main(String[] args) {
		Cliente leonardo = new Cliente();
		leonardo.setNome("Leonardo Messias");
		
		Conta cc = new ContaCorrente(leonardo);
		Conta poupanca = new ContaPoupanca(leonardo);

		cc.depositar(500);
		cc.transferir(300, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
