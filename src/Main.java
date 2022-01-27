
public class Main {

	public static void main(String[] args) {
		Cliente ana = new Cliente();
		ana.setNome("ana");
		
		Conta cc = new ContaCorrente(ana);
		Conta cp = new ContaPoupanca(ana);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
