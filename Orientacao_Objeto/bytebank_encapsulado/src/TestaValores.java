
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 22575);
		
		// conta está inconsistente
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(122, 221);
		Conta conta3 = new Conta(12222, 22121);
		
		System.out.println(Conta.getTotal());
	}
}
