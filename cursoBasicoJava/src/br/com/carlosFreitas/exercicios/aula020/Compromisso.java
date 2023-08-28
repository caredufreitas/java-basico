package br.com.carlosFreitas.exercicios.aula020;

import java.util.Scanner;

public class Compromisso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[][] compromisso = new String[30][24];
		int li = 0, col = 0;
		boolean flag = true;
		while (flag){
			System.out.print("\nOpção:\n[1] - Marcar:\n[2] - Listar:\n[3] - Sair: ");
			int op = scan.nextInt();
			switch (op){
			case 1:
				System.out.print("MARCAR: ");
				System.out.print("\nDia do mês: ");
				li = scan.nextInt();
				System.out.print("\nHora: ");
				col = scan.nextInt();
				for (int i = 0; i < compromisso[li].length; i++){
					for(int j = 0; j < compromisso.length; j++){
						System.out.print("\nDigite o compromisso: ");
						compromisso[li][col] = scan.next();
						break;
					}
					break;
				}
				break;
			case 2:
				System.out.print("LISTAR: ");
				System.out.print("\nDia do mês: ");
				li = scan.nextInt();
				System.out.print("\nHora: ");
				col = scan.nextInt();
				for(int i = 0; i < compromisso[li].length; i++){
					for(int j = 0; j < compromisso.length; j++){
						System.out.print("\n============================================");
						System.out.print("\nDia: " + li);
						System.out.print("\nHora: " + col);
						System.out.print("\nCompromisso: " + compromisso[li][col]);
						System.out.print("\n============================================");
						break;
					}
					break;
				}
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.print("Valor inválido, Tente outra vez! ");
			}
		}
	}

}
