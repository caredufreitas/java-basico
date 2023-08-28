package br.com.carlosFreitas.interfaceHerancaComparacao046;

public interface BancoDeDados extends SqlDCL, SqlDML, SqlDDL{
	
	void abrirConvexao();
	void fecharConvexao();
}
