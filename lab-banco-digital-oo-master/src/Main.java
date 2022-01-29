
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Leonardo Messias");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(1000);
		cc.transferir(600, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
