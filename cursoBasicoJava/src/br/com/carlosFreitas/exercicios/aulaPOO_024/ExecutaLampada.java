package br.com.carlosFreitas.exercicios.aulaPOO_024;

public class ExecutaLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada l1 = new Lampada();
        l1.tipo = "Led";
        l1.quantidade = 2;
        l1.tensao = 220;
        l1.precao = 25.90;

        l1.total();
        l1.descricao();
	}

}
