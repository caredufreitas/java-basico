package br.com.carlosFreitas.exercicios.aula036;

public class Aluno {
	private  String nome;
    private int matricula;
    private double[] notas;
    
    private double media;
    private String situacoes;

    public Aluno() {
    	this.notas = new double[4];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		for (int i = 0; i < notas.length; i++) {
			this.notas[i] = notas[i];
		}
		this.setMedia(this.getNotas());
	}
	
	public double getMedia() {
		return media;
	}

	private void setMedia(double[] notas) {
		double soma = 0, media = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		this.media = soma / 4;
		this. setSituacoes(this.media);
	}

	public String getSituacoes() {
		return situacoes;
	}

	private void setSituacoes(double media) {
			if(media > 7.0) {
				this.situacoes = "Aprovado";
			}else {
				this.situacoes = "Reprovado";
			}
		
	}
}
