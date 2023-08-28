package br.com.carlosFreitas.contaCorrente;

public class ContaCorrente {
	int nuConta;
    double saldo;
    double limite;
    String conta;
    double deposito;

    public ContaCorrente(){
        this.saldo = 150.15;
        this.limite = 300.0;
        this.status();
    }

    void status(){
        if(this.saldo > 3.000){
            this.conta = "Conta Especial. ";
        }else{
            this.conta = "Conta Comum. ";
        }
    }

    void saque(double saque){
        if(saque > this.limite){
            System.out.println("Proibido limite para saque de R$:300");
        }else{
            this.saldo -= saque;
        }
    }

    void deposito(double deposito){
        this.saldo += deposito;
    }

    void descricao(){
        System.out.println("Número da Conta: " + this.nuConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Conta: " + this.conta);

    }
}
