
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		
		Gerente g1 = new Gerente();
		g1.setNome("Mateus");
		g1.setCpf("521524548-87");
		g1.setSalario(5200.20);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autentica = g1.autentica(2222);
	    System.out.println(autentica);

		
		System.out.println(g1.getBonificacao());
	}

}
