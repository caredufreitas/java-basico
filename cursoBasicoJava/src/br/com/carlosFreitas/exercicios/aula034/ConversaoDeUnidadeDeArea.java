package br.com.carlosFreitas.exercicios.aula034;

public class ConversaoDeUnidadeDeArea {
	// pesQuadrado
	public static String pesQuadrado(double cumprimento, double largura) {
		double mtr = metroQuadrado(cumprimento, largura);
		return String.format("%.2f", mtr * 10.76);
	}

	//    centimetrosQuadrado
	public static String centimetroQuadrado(double cumprimento, double largura) {
		double mtr = metroQuadrado(cumprimento, largura);
		double pes = pesQuadrado(mtr);
		return String.format("%.2f", pes * 929);
	}

	//      milhaQuadrada
	public static String milhaQuadrada() {
		double milhaQuadrada = milhasQuadradas();
		return String.format("%.2f", milhaQuadrada * 640);
	}

	//    acre
	public static String acre() {
		double milhaQuadrada = milhasQuadradas();
		double acre = acre(milhaQuadrada);
		return String.format("%.2f", acre * 43.560);
	}

	private static double metroQuadrado(double cumprimento, double largura) {
		return cumprimento * largura;
	}

	private static double pesQuadrado(double mtr) {
		return mtr * 10.76;
	}

	private static double milhasQuadradas() {
		return 3.861 * 10;
	}

	private static double acre(double milhaQuadrada) {
		return milhaQuadrada * 640;
	}
}
