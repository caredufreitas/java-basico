package br.com.carlosFreitas.exercicios.aula034;

public class TesteConversaoDeUnidadeVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Centimetros Cúbico: "
                + ConversaoDeUnidadeDeVolume.centimetroCubico(1));
        System.out.println("Litros: "
                + ConversaoDeUnidadeDeVolume.metroCubico(3));
        System.out.println("Pés Cúbico: "
                + ConversaoDeUnidadeDeVolume.pesCubico(1));

        System.out.println("Polegada Cúbica: "
                + ConversaoDeUnidadeDeVolume.polegadaCubica(1));
        System.out.println("Litros: "
                + ConversaoDeUnidadeDeVolume.litro(1));
	}

}
