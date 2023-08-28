package br.com.carlosFreitas.matrizes;

public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] notasAlunos = new double[4][4];
		//      duasEntidades vai no plural, 30 - alunos, 4 - notas
		//      primeiro Aluno
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;

		//      segundo Aluno
		notasAlunos[1][0] = 3;
		notasAlunos[1][1] = 4;
		notasAlunos[1][2] = 8;
		notasAlunos[1][3] = 9.5;

		//      terceiro Aluno
		notasAlunos[2][0] = 5;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 2;
		notasAlunos[2][3] = 10;

		//      quarto Aluno
		notasAlunos[3][0] = 2;
		notasAlunos[3][1] = 1;
		notasAlunos[3][2] = 5.2;
		notasAlunos[3][3] = 7.9;

		for (int i = 0; i < notasAlunos.length; i++){
			for (int j = 0; j < notasAlunos[i].length; j++){ // atencao no indice do j.
				System.out.println(notasAlunos[i][j]);
			}
			System.out.println("======"+ (i + 1)+ "ª Aluno======");
		}
	}

}
