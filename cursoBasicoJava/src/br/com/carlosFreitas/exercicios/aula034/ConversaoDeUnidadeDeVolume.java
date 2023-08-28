package br.com.carlosFreitas.exercicios.aula034;

public class ConversaoDeUnidadeDeVolume {
	//  centimetroCubico
	public static double centimetroCubico(int volume){
		double cm = converterCentimetroCubico(volume);
		return cm;
	}
	//  metroCubico
	public static double metroCubico(int volume){
		double mtr = converterLitrosEmMetrosCubicos(volume);
		return mtr;
	}
	//pesCubico
	public static double pesCubico(int volume){
		double mtr = converterLitrosEmMetrosCubicos(volume);
		return mtr * 35.52;
	}
	//  galaoAmericano
	public static double polegadaCubica(int gal){
		return gal * 231.00;
	}
	//litros
	public static double litro(int gal){
		return gal * 3.785;
	}


	private static double converterLitrosEmMetrosCubicos(int volume) {
		return volume * 1000;
	}

	private static double converterCentimetroCubico(int volume) {
		return volume * 1000;
	}
}
