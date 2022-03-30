
public class ExercicioAula06 {
	public static void main(String[] args) {
		double salario = 4665.0;
		double salarioDeduzido = 0.00;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			salarioDeduzido = (salario - 142.0);
		} else if (salario >= 2800.01 && salario <= 3751.00) {
			salarioDeduzido = (salario - 350.0);
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			salarioDeduzido = (salario - 636.00);
		} else {
			System.out.println("Seu salario não encontra-se na "
					+ "tabela de Imposto de Renda(IR)");
		}
		
		if(salarioDeduzido > 0.00) {
			System.out.println("Seu salario atual é de " + salarioDeduzido);
		}
	}

}
