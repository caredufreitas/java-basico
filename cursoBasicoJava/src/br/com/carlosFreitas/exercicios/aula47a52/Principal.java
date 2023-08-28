package br.com.carlosFreitas.exercicios.aula47a52;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		while(opcao != 3) {
			// testar o metodo, passando o scanner
			opcao = obterOpcaoMenu(scan);
			if (opcao == 1) { // consultar contato
				consultarContato(scan, agenda); // passando para o método
			} else if (opcao == 2) { // dicionar contato
				adicionarContato(scan, agenda);
			} else if (opcao == 3) { // Sair
				System.exit(0);
				// sistemas web nao usamos, opcional
			}
		}
	}
	
// adicionarContato
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		System.out.println("Criando um contato, entre com as informações. ");
		String nome = lerInformacaoString(scan, "Entre com o nome do contato. ");
		String telefone = lerInformacaoString(scan, "Entre com o telefone do contato. ");
		String email = lerInformacaoString(scan, "Entre com o email do contato. ");
//		com todas informacoes criamos um contato
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		System.out.println("Contato a ser criado. ");
		System.out.println(contato); // devido ter o toString(), ele vai imprimir 
		
//		chamar agenda adicionar contato, tambem lança uma exception
//		tratar no metodo pois no main vamos mostrar para um usuario
		try {
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
//			tambem conseguimos por logica de programacao
			System.out.println("Contatos da agenda. ");
			System.out.println(agenda);
		}
	}
	
//	consultarContato
	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = lerInformacaoString(scan, "Entre com o contato a ser pesquisado. ");
//		o metodo consultar contato retorna um inteiro, entao se for maior que 0 ele existe.
		try {
			if (agenda.consultarContato(nomeContato) >= 0) {
				/*
				 * este método consultarContato ele pode lançar uma exception a IDE ja perguta
				 * do tratamento tratar agora
				 */
				System.out.println("Contato existe. ");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

//	lerContatos
	public static String lerInformacaoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

//	obterOpcaoDoMenu
	public static int obterOpcaoMenu(Scanner scan) {
		boolean valida = false;
		int opcao = 3; // aqui para sair
//		nao for valida
		while (!valida) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Consultar contato. ");
			System.out.println("2: Adicionar contato. ");
			System.out.println("3: Sair. ");
//			o código que pode dar um erro, precisa tratar com um try
			try {
//				ver toda entrada do teclado
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

//				aqui a opcao nao pode ser a que precisamos
				if (opcao == 1 || opcao == 2 || opcao == 3) { // entrada se torna válida
					valida = true;
				} else {
//					lancar uma exception
					throw new Exception("Entrada inválida. ");
				}
			} catch (Exception e) { // se acontecer uma exception, capturar
				System.out.println("Entrada inválida digite novamente! \n");
			}
		}

		/*
		 * Aqui o usuario pode nao digitar inteiro ou a opcao que precisamos.
		 */
		return opcao;
	}

}
