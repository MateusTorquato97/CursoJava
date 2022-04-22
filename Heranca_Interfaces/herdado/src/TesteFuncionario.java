
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Designer nico = new Designer();
		nico.setNome("Nico Steppat");
		nico.setCpf("2252274824-54");
		nico.setSalario(2590.20);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}

}
