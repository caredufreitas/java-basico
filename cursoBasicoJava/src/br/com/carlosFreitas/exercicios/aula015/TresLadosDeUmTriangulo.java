package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class TresLadosDeUmTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o lado A do tri�ngulo: ");
		double a = scan.nextDouble();
		System.out.print("Digite o lado B do tri�ngulo: ");
		double b = scan.nextDouble();
		System.out.print("Digite o lado C do tri�ngulo: ");
		double c = scan.nextDouble();
		//        saida
		System.out.println("A "+ a + ", B "+ b + ", C "+ c);
		if(a < b + c && b < a + c && c < a + b){
			System.out.println("Podem Formar um Tri�ngulo.");
			if(a == b && b == c){
				System.out.println("Equil�tero! ");
			}else if (a != b && b != c && c != a){
				System.out.println("Escaleno! ");
			}else{
				System.out.println("Isoceles! ");
			}
		}else{
			System.out.println("N�o podem formar um tri�ngulo! ");
		}
	}

}
