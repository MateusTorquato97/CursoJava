package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 13);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 11);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(22, 13);
		lista.add(cc4);
		
		System.out.println("Qtd: " + lista.size());
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Qtd: " + lista.size());
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("---------");
		
		for(Conta oRef : lista) {
			System.out.println(oRef);
		}

	}

}
