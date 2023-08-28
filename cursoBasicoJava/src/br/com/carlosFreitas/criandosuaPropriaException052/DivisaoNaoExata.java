package br.com.carlosFreitas.criandosuaPropriaException052;

// criando nossa propria exception
// extends Exception
public class DivisaoNaoExata extends Exception{
//	somente para mostra os valores na mensagem da exception	
	private int num;
	private int don;
	
//	constutor com os campos para facilitar
	public DivisaoNaoExata(int num, int don) {
		super();
		this.num = num;
		this.don = don;
	}
//	não precisa por os campos
//	e com isto conseguimos ter nossa exceptions
	@Override
	public String toString() {
		return "Resultado de " + num + " / " + don + " não é um inteiro. ";
	}
	
	
}
