package br.com.carlosFreitas.exercicios.aula017;

import java.util.Scanner;

public class UsuarioSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Entre com usuário: ");
            String user = new String(scan.next().toLowerCase().trim());
            System.out.print("Entre com senha: ");
            String pass = new String(scan.next().toLowerCase().trim());
            if(user.contentEquals(pass)){
                System.out.println("Erro tente outra vez! ");
            }else{
                System.out.println("Logado! ");
                break;
            }
        }
	}

}
