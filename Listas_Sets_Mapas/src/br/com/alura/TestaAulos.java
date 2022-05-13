package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAulos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Mateus");
		alunos.add("Emily");
		alunos.add("Maxwel");
		alunos.add("Anderson");
		alunos.add("Thiago");
		alunos.add("William");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo");
		System.out.println(pauloEstaMatriculado);
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}

}
