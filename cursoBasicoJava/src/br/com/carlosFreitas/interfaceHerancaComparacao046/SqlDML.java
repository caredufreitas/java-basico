package br.com.carlosFreitas.interfaceHerancaComparacao046;

public interface SqlDML {
	
	void select(String query);
	void insert(String query);
	void delete(String query);
	void update(String query);
}
