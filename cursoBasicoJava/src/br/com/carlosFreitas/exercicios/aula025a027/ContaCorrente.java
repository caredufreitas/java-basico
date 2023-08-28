package br.com.carlosFreitas.exercicios.aula025a027;

public class ContaCorrente {

	int nuConta;
	double saldo;
	String status;
	double limite;

	public ContaCorrente(){
		this.acrecentarStatus();
	}

	//    sacar
	String sacar(double sacar){
		String resp = "";
		if(sacar > this.saldo){
			resp = "Saldo insuficiente para saque! ";
		}else{
			this.saldo -= sacar;
			resp = "Opera��o realizada! ";
		}
		return resp;
	}

	//    depositar
	String depositar(double depositar){
		String resp = "";
		resp = "Opera��o realizada! ";
		this.saldo = depositar;
		return resp;
	}

	//    consultarSaldo
	String consultarSaldo(){
		String resp = "";
		if(this.status.equals("Especial")){
			resp = "Cliente Sim Especial! ";
		}else{
			resp = "Cliente N�o Especial! ";
		}
		return resp +" Saldo R$:" + String.valueOf(this.saldo);
	}

	//
	private void acrecentarStatus() {
		if(this.nuConta > 5){
			this.status = "Especial";
		}else{
			this.status = "Comum";
		}
	}

}
