package br.com.carlosFreitas.exercicios.aula015;

import java.util.Scanner;

public class PromocaoCarne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fileDuplo = 0, alcatra = 0, picanha = 0, preco = 0, k = 0, vd = 0;
		String tipo = "";
		String pg = "";

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite:\n1-File Duplo\n2-Alcatra\n3-Picanha ");
		int op = scan.nextInt();
		switch (op){
		case 1:
			System.out.print("File Duplo");
			System.out.print("Quantos kilos? ");
			k = scan.nextDouble();
			tipo = "File Duplo";
			if(k <= 5){
				fileDuplo = k * 4.9;
			}else {
				fileDuplo = k * 5.9;
			}
			System.out.print("Pagamento no cartão TABAJARA? ");
			pg = new String(scan.next().toUpperCase().trim().substring(0, 1));
			if(pg.equals("S")){
				preco = fileDuplo - (fileDuplo * 5) / 100;
				vd = (fileDuplo * 5) / 100;
			}else {
				preco = fileDuplo;
			}
			break;
		case 2:
			System.out.print("Alcatra");
			System.out.print("Quantos kilos? ");
			k = scan.nextDouble();
			tipo = "Alcatra";
			if(k < 5){
				alcatra = k * 5.9;
			}else{
				alcatra = k * 6.8;
			}
			System.out.print("Pagamento no cartão TABAJARA? ");
			pg = new String(scan.next().toUpperCase().trim().substring(0, 1));
			if(pg.equals("S")){
				preco = alcatra - (alcatra * 5) / 100;
				vd = (alcatra * 5) / 100;
			}else{
				preco = alcatra;
			}
			break;
		case 3:
			System.out.print("Picanha");
			System.out.print("Quantos kilos? ");
			k = scan.nextDouble();
			tipo = "Picanha";
			if(k < 5){
				picanha = k * 6.9;
			}else{
				picanha = k * 7.8;
			}
			System.out.print("Pagamento no cartão TABAJARA? ");
			pg = new String(scan.next().toUpperCase().trim().substring(0, 1));
			if(pg.equals("S")){
				preco = picanha - (picanha * 5) / 100;
				vd = (picanha * 5) / 100;
			}else{
				preco = picanha;
			}
			break;
		default:
			System.out.print("Numero inválido! ");
		}

		//        saida
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Tipo de carne: " + tipo);
		System.out.println("Quantidade: " + k);
		System.out.println("Pagamento no cartão TABAJARA: " + pg);
		System.out.println("Valor de desconto " + vd + "%. ");
		System.out.println("Total a pagar R$: " + String.format("%.2f", preco));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

}
