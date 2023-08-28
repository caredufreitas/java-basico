package br.com.carlosFreitas.metodosSobrecarga033;

public class MinhaCalculadora {
//  polimorfismo em tempo de compilação
  public int soma(int num1, int num2){
      return num1 + num2;
  }
//  modificando somente o tipo primitivo da assinatura
  public double soma(double num1, double num2){
      return num1 + num2;
  }

  public int soma(int num1, int num2, int num3){
      return num1 + num2 + num3;
  }

  public int soma(int[] vetorInteiros){
      int total = 0;
      for (int i = 0; i < vetorInteiros.length; i++){
          total += vetorInteiros[i];
      }
      return total;
  }
}
