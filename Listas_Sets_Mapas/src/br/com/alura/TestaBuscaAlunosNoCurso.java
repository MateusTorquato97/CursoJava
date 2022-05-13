package br.com.alura;

import java.util.Map;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 10));

		Aluno a1 = new Aluno("Mateus", 2433);
		Aluno a2 = new Aluno("Emily", 5617);
		Aluno a3 = new Aluno("Mauricio", 34545);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("aluno: " + aluno);
	}
}
