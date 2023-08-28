package br.com.carlosFreitas.exercicios.aula017;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorMedioInvestidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
        double qtd = 0, total = 0, media = 0;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        do {
            System.out.print(i+ "ª Digite a quantidade de CDs: ");
            int q = scan.nextInt();
            System.out.print(i+ "ª Preço R$: ");
            String p = new String(scan.next());
            Double preco = Double.parseDouble(p);
            qtd += q;
            total += preco;
            System.out.print("Gravar mais dados [S/N]: ");
            String resp = new String(scan.next().toUpperCase().trim().substring(0, 1));
            if(resp.equals("N")){
                break;
            }
            i++;
        }while(true);
        media = total / qtd;
        System.out.println("Total investido R$: "+ df.format(media).replace(',', '.'));
	}

}
