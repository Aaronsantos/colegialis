package br.edu.ifpb.collegialis.entity;

import java.util.List;

public interface Usuario {
	
	public boolean login(String matricula, String senha);
	public String getRole();	
	public List<Colegiado> getColegiados();	
}
