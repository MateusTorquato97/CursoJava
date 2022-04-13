
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaMateus = new Conta();
		contaMateus.saldo = 100;
		contaMateus.deposita(50);
		boolean conseguiuRetirar = contaMateus.saca(20);
		
		System.out.println(contaMateus.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaEmily = new Conta();
		contaEmily.deposita(1000);
		
		contaEmily.transfere(200, contaMateus);
		System.out.println(contaEmily.saldo);
		System.out.println(contaMateus.saldo);
		
		contaEmily.titular = "Emily Borges";
		System.out.println(contaEmily.titular);
	}
}
