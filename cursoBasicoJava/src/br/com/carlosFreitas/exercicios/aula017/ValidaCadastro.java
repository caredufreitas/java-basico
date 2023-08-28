package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class ValidaCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("Digite o seu nome: ");
            String nome = new String(scan.next().trim());
            System.out.print("Digite sua idade: ");
            int idade = scan.nextInt();
            System.out.print("Digite seu salário R$: ");
            double salario = scan.nextDouble();
            System.out.print("Digite seu sexo: [M/F]: ");
            String sexo = new String(scan.next().toLowerCase().trim().substring(0, 1));
            System.out.print("Estado civil: [S/C/V/D]: ");
            String civil = new String(scan.next().toLowerCase().trim().substring(0, 1));

            if(nome.length() > 3 && (idade >= 0 && idade <= 150) && salario > 0 &&
                    (sexo.equals("m") || sexo.equals("s")) &&
                    (civil.equals("s") || civil.equals("c") || civil.equals("v") || civil.equals("d"))){
                System.out.println("Cadastro validado com sucesso! ");
                break;

            }else{
                System.out.println("==========================================================================");
                if(nome.length() < 3){
                    System.out.println("Erro ("+ nome+ ") nome precisa ter no minimo 3 caracteres! ");
                }
                if(idade < 0 || idade > 150){
                    System.out.println("Erro ("+ idade+ ") idade tem que ser maior que 0 e menor que 150. ");
                }
                if(salario <= 0.0){
                    System.out.println("Erro ("+ salario+ ") salário tem que maior que 0.");
                }
                if(!sexo.contains("mf")){
                    System.out.println("Erro ("+ sexo+ ") sexo tem quer ser [M/F]. ");
                }
                if(!civil.contains("scvd")){
                    System.out.println("Erro ("+ civil+ ") estado civil tem que ser [S/C/V/D]. ");
                }
                System.out.println("==========================================================================");
            }
        }
        System.out.println("Fim. ");
	}

}
