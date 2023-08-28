package br.com.carlosFreitas.exercicios.aula47a52;

public class Agenda {

	private Contato[] contatos;

	public Agenda() {
		contatos = new Contato[5];
	}

	// adicionar contato
	public void adicionarContato(Contato c) throws AgendaCheiaException {
		// verificar se agenda esta cheia
		boolean cheia = true;
		// verificar se agenda está cheia e ver em qual posicao da agenda pode adicionar
		// este contato
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) { // verificar qual posicao para adicionar o contato no array
				contatos[i] = c;
				cheia = false;
				break; //terminar o for para nao preencher o array
			}
		}
		// verificar se agenda esta cheia
		if (cheia) {
			// lancar uma exception
			throw new AgendaCheiaException();
			/*
			 * como não vou tratar a exception aqui vou passar ela para frente adicionando
			 * throw na assinatura do método. Add throw declaration
			 */
		}
	}

	// consultar
	// parametro nome para consulta contato
	public int consultarContato(String nome) throws ContatoNaoExisteException {
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) { // verificar se tem contato no array
				// aqui faremos a decissao de que precisamos
				if (contatos[i].getNome().equalsIgnoreCase(nome)) { // contatos tem nome, equals ignorecase para
					return 1; //retorna 1 para verificação da lista 
				}
			}
		}
		// vai passar por todo o for e o contato não exista
		//	lançar a exception de contato não existe, throw na assinatura do metodo para passar para frente o tratamento
		throw new ContatoNaoExisteException(nome);
	}

	@Override
	public String toString() {
		String s = "";
		// iterando array
		for (Contato c : contatos) {
			if(c != null) {
				s += c.toString() + "\n";
			}
		}
		return s;
	}

	/*
	 * Não queremos que o usuário tenha acesso aos atributos e métodos nesta classe
	 * aqui então não criaremos get, set
	 */
}
