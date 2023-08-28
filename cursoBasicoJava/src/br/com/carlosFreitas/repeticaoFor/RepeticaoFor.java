package br.com.carlosFreitas.repeticaoFor;

public class RepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      normal com variavel de escopo
      for (int i = 0; i < 11; i++){
          System.out.print(i + ", ");
          if( i == 10){
              System.out.print(" Fim\n");
          }
      }
//    mais de uma variavel
      for (int i = 0, j = 10; i < j; i++, j--){
//          no momento que i = 5 e j = 5 o bloco nao sera mais executado.
          System.out.println("i = " + i + " j = " + j);
      }

          int count = 0;
          for( ;count < 5 ; ){
              System.out.print(count+ ", ");
              count += 2;
          }

          for (int c = 0; c <= 10; c += 2){
              System.out.print(c);
          }
//          for infinito
      for( ; ;){
//          System.out.println("Batch!!!!!!!");
      }
	}

}
