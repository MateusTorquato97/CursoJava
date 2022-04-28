package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 30);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//Object referenciaGeneria = contas[1];
		
		//System.out.println();
		//System.out.println(contas[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println(ref.getNumero());
		System.out.println(cc2.getNumero());
	}

}
