package br.com.carlosFreitas.tiposPrimitivos;
/*tipo - tamanho - intervalo de valores
* byte      8        -128 a 127                                             -(2\7) a 2/7 - 1
* short     16       -32.768 a 32.767                                       -(2/15) a 2/15 - 1
* int       32       -2.147.483.648 a 2.147.483.647                         -(2/31) a 2/31 - 1
* long      64       -9.223.372.036.854.775.808 a 9.223.372.036.854.775.808 -(2/63) a 2/63 - 1
* Na prática tente da nome de variavéis que signifique alguma coisa.
* */
public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte idade = 20;
		short idade01 = 21;
		int idade02 = 22;
		long idade03 = 23;
		System.out.println("Numeros: ");
		System.out.println("Valor da variável Byte: " + idade);
		System.out.println("Valor da variável Short: " + idade01);
		System.out.println("Valor da variável int: " + idade02);
		System.out.println("Valor da variável Long: " + idade03);

		String nome = "Carlos"; //não é um tipo primitivo em java é uma classe;
		String nomeGato = "Zéquinha";
		float saldo1 = 100.30f; //f - literal
		double saldo2 = 100.30;
		char o = 111; //caracter ascii
		char i = 105;
		char exclamacao = 002001; //unicode
		boolean verdadeiro = true;
		boolean falso = false;

		//        idade = 25;
		//        System.out.println("Idade: " + idade);
		//        System.out.println("Nome: " + nome);
		//        System.out.println("Nome Gato: " + nomeGato);
		//imprimir caracter ascii
		//        System.out.println("" + o + i);
	}

}
