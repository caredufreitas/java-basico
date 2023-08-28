package br.com.carlosFreitas.repeticaoForEach021;

import java.util.Random;

public class RepeticaoForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * forEach � como se estivesse criando uma vari�vel para aquela
		 * possi��o do array, o contador � interno e n�o temos acesso.
		 * nota��o forEach � mais pr�tica que o for.
		 * */
		//	        exemplo 01
		int[] notas = new int[10];
		Random random = new Random();
		//	        exemplo 02
		double[][] notasAlunos = new double[3][4];
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		//	        exemplo 01
		for(int i = 0; i < notas.length; i++){
			notas[i] = random.nextInt(10);
		}
		//	        exemplo 01 nota��o forEach.
		for (int nota: notas) {
			System.out.print(nota + ", ");
		}
		System.out.println("\n=======================================================");
		/*
		 * exemplo 02 itera��o em matriz, o tipo � um dooble assim estamos acessando
		 * o array de notas de cada aluno.
		 * */
		for(double[] notaAluno : notasAlunos){
			//	            outro forEach para referenciar a primeira notaAluno
			for( double nota: notaAluno){
				System.out.print(nota + " ");
			}
			System.out.println();
		}

	}

}
