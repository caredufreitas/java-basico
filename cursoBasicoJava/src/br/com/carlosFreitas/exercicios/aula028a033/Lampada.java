package br.com.carlosFreitas.exercicios.aula028a033;

public class Lampada {
	private String tipo;
    private int tensao;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public String chavearLampada(boolean chave){
        String resp = "";
        if(chave){
            resp = "Lampada ligada";
        }else{
            resp = "Lampada desligada";
        }
        return resp;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "tipo='" + tipo + '\'' +
                ", tensao=" + tensao +
                '}';
    }
}
