package br.com.carlosFreitas.classeObjeto043;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		double[] notas = {4, 6, 7, 8, 2};
//		inicializando array
		aluno.setCurso("Matemática Aplicada. ");
		aluno.setNotas(notas);
		
		System.out.println(aluno);
//		retorna o toString()
		
//		metodo equals
		String s1 = "asdsdfsdf";
		String s2 = "asdsdfsdf";
		
//		System.out.println(s1 == s2);
//		System.out.println(s1.equalsIgnoreCase(s2));
		/*
		 * quando fazemos este tipo de operacao relacional no java comparamos as
		 * referencias não os valores pois s1 e s2 é um objeto.
		 */
		Aluno aluno02 = new Aluno();
		aluno02.setCurso("Matemática Aplicada. ");
		double[] notas02 = {10, 3, 4, 5, 6};
		aluno02.setNotas(notas02);
		
//		System.out.println(aluno == aluno02);
//		mesma maneira de comparar referencia a melhor maneira de comparar objeto é equals
		System.out.println(aluno.equals(aluno02));
//		aqui ele vai comparar também os atributos;
	}
	

}
