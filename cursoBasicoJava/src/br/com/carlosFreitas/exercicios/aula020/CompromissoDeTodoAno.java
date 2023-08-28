package br.com.carlosFreitas.exercicios.aula020;

import java.util.Scanner;

public class CompromissoDeTodoAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[][][] compromisso = new String[13][32][9]; // multiplica 8 * 31 * 12 = 2.976
		boolean flag = true;
		int mes = 0, dia = 0, hora = 0;
		/*System.out.println(compromisso.length); //linha
        System.out.println(compromisso[0].length); //coluna
        System.out.println(compromisso[0][0].length); //coluna 2*/
		while (flag){
			System.out.print("\nOpção:\n[1] - Marcar:\n[2] - Listar:\n[3] - Sair:");
			int op = scan.nextInt();

			switch (op){
			case 1:
				//horas, dia, mes
				System.out.print("Marcar: ");
				System.out.print("\nNúmero do mês: ");
				mes = scan.nextInt();
				System.out.print("\nDia do dia: ");
				dia = scan.nextInt();
				System.out.print("\nHoras: ");
				hora = scan.nextInt();
				for (int i = 0; i < compromisso.length; i++){ //12
					for(int j = 0; j < compromisso[i].length; j++){
						for(int k = 0; k < compromisso[i][j].length; k++){
							System.out.print("Digite o compromisso: ");
							compromisso[mes][dia][hora] = scan.next();
							break;
						}
						break;
					}
					break;
				}
				break;
			case 2:
				//horas, dia, mes
				System.out.print("\nListar: ");
				System.out.print("\nNúmero do mês: ");
				mes = scan.nextInt();
				System.out.print("\nDia do dia: ");
				dia = scan.nextInt();
				System.out.print("\nHoras: ");
				hora = scan.nextInt();
				System.out.print("\n=======================================");
				System.out.print("\nMês: " + mes);
				System.out.print("\nDia: " + dia);
				System.out.print("\nHoras: " + hora);
				for (int i = 0; i < compromisso.length; i++){ //12
					for(int j = 0; j < compromisso[i].length; j++){
						for(int k = 0; k < compromisso[i][j].length; k++){
							System.out.print("\nCompromisso: " + compromisso[mes][dia][hora]);
							break;
						}
						break;
					}
					break;
				}
				System.out.print("\n=======================================");
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("Valor inválido, Tente novamente! ");
			}
		}
	}

}
