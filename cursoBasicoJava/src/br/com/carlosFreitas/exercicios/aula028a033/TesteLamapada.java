package br.com.carlosFreitas.exercicios.aula028a033;

public class TesteLamapada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada lamp = new Lampada();
		lamp.setTipo("Fluorescente");
		lamp.setTensao(220);

		System.out.println(lamp.toString());
		System.out.println(lamp.chavearLampada(false));
	}

}
