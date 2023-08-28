package br.com.carlosFreitas.relacionamentoEntreClasses036;

public class TesteRelacionamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//      instânciar endereco para passar para o contado
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Game of Thrones");
		endereco.setNumero("n/a");
		endereco.setComplemento("casa");
		endereco.setCidade("Kings Landing");
		endereco.setEstado("Westeros");

		Telefone telefone = new Telefone();
		telefone.setNumero("99999-9999");
		telefone.setDdd("11");
		telefone.setTipo("Celular");

		Telefone telefone2 = new Telefone();
		telefone2.setNumero("4519-9999");
		telefone2.setDdd("11");
		telefone2.setTipo("Casa");

		Contato contato = new Contato();
		contato.setNome("Tyrion");
		//    contato.setTelefone("11 99999-9999");

		//    setando telefones em relacionamento tem um
		//    contato.setTelefone(telefone);
		//    colocando dentro de um array, 2 objetos telefone temos
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		//setando como atributo do contato
		contato.setTelefone(telefones);

		//      setando endereco em contato
		contato.setEnderecos(endereco);

		System.out.println(contato.getNome());
		/*
		 * somente
		 * contato.getEnderecos()
		 * Vai trazer somente o endereço de memória
		 * contato.getEnderecos().getCidades()
		 * Vai trazer o valor setado na classe Endereço, atributo cidade
		 * */
		System.out.println(contato.getEnderecos().getCidade());
		//      System.out.println(contato.getTelefone());
		//      pegando do array telefones, tratamento de campo caso telefone for null
		if (contato != null && contato.getTelefone() != null) {
			for (Telefone t: contato.getTelefone()) {
				System.out.println(t.getDdd() + ", " + t.getNumero() + ", " + t.getTipo());
			}
		}
	}

}
