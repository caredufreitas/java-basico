package br.com.carlosFreitas.exercicios.aula034;

public class TesteConversaoDeUnidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("P�s Quadrado: "
                + ConversaoDeUnidadeDeArea.pesQuadrado(1.78, 2.56));
        System.out.println("Centimetros Quadrado: "
                + ConversaoDeUnidadeDeArea.centimetroQuadrado(1.78, 2.56));
        System.out.println("Acre: "
                + ConversaoDeUnidadeDeArea.milhaQuadrada());
        System.out.println("P�s Qaudrado: "
                + ConversaoDeUnidadeDeArea.acre());
	}

}
