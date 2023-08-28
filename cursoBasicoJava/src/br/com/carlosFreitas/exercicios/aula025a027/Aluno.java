package br.com.carlosFreitas.exercicios.aula025a027;

public class Aluno {
	String nome;
    int matricula;
    String curso;
    String disciplina01;
    String disciplina02;
    String disciplina03;
    double nota01;
    double nota02;
    double nota03;

    String verificarAluno(String disciplina, double nota){
        String resp = "";
        if(disciplina.equals(disciplina) && nota >= 7){
            resp = "Aprovado na disciplina, " + disciplina+ ", nota "+ nota;
        }
        return resp;
    }
}
