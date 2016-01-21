package br.com.alura.loja.modelo;

import com.thoughtworks.xstream.XStream;

public class Projeto {
	
	private long id;
	private String nome;
	private long anoDeInicio;
	
	public Projeto(long id, String nome, long anoDeInicio) {
		super();
		this.id = id;
		this.nome = nome;
		this.anoDeInicio = anoDeInicio;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getAnoDeInicio() {
		return anoDeInicio;
	}
	public void setAnoDeInicio(long anoDeInicio) {
		this.anoDeInicio = anoDeInicio;
	}
	
	public String toXml() {
		return new XStream().toXML(this);
	}
	
	

}
