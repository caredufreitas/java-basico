package br.com.carlosFreitas.operadores;

public class CurtoCircuito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean veredadeiro = true;
        boolean falso = false;

        boolean resultado = falso && veredadeiro;
        boolean resultado02 = falso & veredadeiro;
        System.out.println(resultado);
        System.out.println(resultado02);
        /*
        * curto circuito ele n�o analisa a segunda express�o mais eficaz na tabela
        *verdade, por isto � mais utilizado o curto circuito legal ver quando estamos debugando.
        * n�o curto circuito ele analisa a segunda express�o.
        * */
	}

}
