package br.com.carlosFreitas.exercicios.aula036;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contato contato = new Contato();
		contato.setNome("Zequinha");
		contato.setTelefone("11-99999-9999");
		contato.seteMail("zequinha@gmail.com");

		Contato contato1 = new Contato();
		contato1.setNome("Carlos");
		contato1.setTelefone("11 88888-8888");
		contato1.seteMail("carlos@gmail.com");

		Contato[] contatos = new Contato[2];
		contatos[0] = contato;
		contatos[1] = contato1;

		Agenda agenda = new Agenda();
		agenda.setNome("Familia");
		agenda.setContatos(contatos);

		System.out.println(agenda.getNome());
		for (Contato c: agenda.getContatos()) {
			System.out.println(c.getNome());
			System.out.println(c.getTelefone());
			System.out.println(c.geteMail());
		}
	}

}
