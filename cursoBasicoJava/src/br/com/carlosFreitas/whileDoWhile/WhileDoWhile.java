package br.com.carlosFreitas.whileDoWhile;

public class WhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i < 11){
			System.out.print((i -1 ) + ", ");
			if(i == 10){
				System.out.println(i);
			}
			i++;
		}

		System.out.println(i);

		do {
			i--;
			System.out.print(i + ", ");
		}while(i > 0);
	}

}
