package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.doubleValue());
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Integer.valueOf(29);


		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(20.1);
	}

}
