package br.com.carlosFreitas.metodosSobrecarga033;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        MinhaCalculadora calc = new MinhaCalculadora();
        calc.soma(1, 2);
        calc.soma(1.0, 2.0);
        /*
        * chamar varios metodos com o mesmo parametros
        * modificando a assinatura.
        * */
	}

}
