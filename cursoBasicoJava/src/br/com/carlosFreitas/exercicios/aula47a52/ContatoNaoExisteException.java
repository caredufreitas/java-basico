package br.com.carlosFreitas.exercicios.aula47a52;

public class ContatoNaoExisteException extends Exception {
//	vamos passar o nome do contato
	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	@Override
		public String getMessage() {
			return "Contato " + nomeContato + " não existe na agenda. ";
		}
}

