package br.com.carlosFreitas.operadores;
/*
* + adicao (e mais un�rio)
* - subtra��o (e menos un�rio)
* * multiplica��o
* / divis�o
* % m�dulo o resto da divis�o
* ++ incremento (p�s e pr� fix)
* -- decremento (p�s e pr� fix)
* */
public class Aritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = 1 + 2;
		System.out.println(resultado);

		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
	
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);

		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);

		String primeiroNome = "Est� �, ";
		String segundoNome = "uma string, ";
		String terceiroNome = "concatenada.";
		System.out.println(primeiroNome + segundoNome + terceiroNome);

		resultado = resultado + 1;
		System.out.println(resultado);
		//	      5
		resultado++;
		System.out.println(resultado);
		//	        resultado depois adiciona 1
		System.out.println(resultado++);
		//	        adiciona 1 depois soma o resultado
		System.out.println(++resultado);

		resultado += 1;
		System.out.println(resultado);
		//	      7
		resultado--;
		System.out.println(resultado);
		--resultado;
		System.out.println(resultado);
	}

}
