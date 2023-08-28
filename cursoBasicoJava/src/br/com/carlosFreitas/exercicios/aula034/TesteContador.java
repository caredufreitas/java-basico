package br.com.carlosFreitas.exercicios.aula034;

public class TesteContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador cont = new Contador();
        Contador.acrementar();
        Contador.acrementar();
        Contador.acrementar();
        Contador.acrementar();
        Contador.acrementar();
        Contador.decrementar();
        System.out.println(Contador.contador);
        Contador.zerar();
        System.out.println(Contador.contador);
	}

}
