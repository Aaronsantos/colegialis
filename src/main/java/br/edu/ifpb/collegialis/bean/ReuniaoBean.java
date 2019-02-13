package br.edu.ifpb.collegialis.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifpb.collegialis.dao.ReuniaoDAO;
import br.edu.ifpb.collegialis.entity.Reuniao;

@ManagedBean(name="reuniaoBean")
@RequestScoped
public class ReuniaoBean {
	
	private List<Reuniao> reunioes;
	private ReuniaoDAO dao ;
	
	public void load() {
		EntityManagerFactory fac = Persistence.createEntityManagerFactory("collegialis");
		EntityManager em = fac.createEntityManager();
		
		this.dao = new ReuniaoDAO(em);
		
		dao.beginTransaction();
		this.reunioes = dao.findAll();
		
	}

	public List<Reuniao> getReunioes() {
		return reunioes;
	}

	public void setReunioes(List<Reuniao> reunioes) {
		this.reunioes = reunioes;
	}
	
	
}
