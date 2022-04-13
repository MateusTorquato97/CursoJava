public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println("Saldo: " + segundaConta.saldo);
	}
}
