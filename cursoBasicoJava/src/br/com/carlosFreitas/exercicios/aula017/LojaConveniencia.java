package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class LojaConveniencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
        double total = 0;
        boolean op = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lojas Tabajara ");
        System.out.println("[0]-SAIR. ");
        do {
            System.out.print("Preço R$: ");
            String p = new String(scan.next());
            Double preco = Double.parseDouble(p);
            total += preco;
            System.out.println("Produto "+ i+ ": R$ "+ String.format("%.2f", preco));
            int saida = (int) Math.round(preco);
            if(saida == 0){
                op = false;
            }
            i++;
        }while (op);

        System.out.println("=============================");
        System.out.println("Valor em Dinheiro R$: ");
        String d = new String(scan.next());
        System.out.println("=============================");
        Double dinheiro = Double.parseDouble(d);
        double troco = dinheiro - total;
        System.out.println("Nota");
        System.out.println("=============================");
        System.out.println("Total R$: "+ total);
        System.out.println("Dinheiro R$: "+ dinheiro);
        System.out.println("Troco R$: "+ troco );
        System.out.println("=============================");
	}

}
