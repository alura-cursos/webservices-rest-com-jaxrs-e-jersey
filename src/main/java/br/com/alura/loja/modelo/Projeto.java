package br.com.alura.loja.modelo;

import com.thoughtworks.xstream.XStream;

public class Projeto {

	private String nome;
	private long id;
	private int anoDeInicio;
	
	public Projeto(String nome, long id, int anoDeInicio){
		this.nome = nome;
		this.id = id;
		this.anoDeInicio = anoDeInicio;
	}
	
	public Projeto(){}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoDeInicio() {
		return anoDeInicio;
	}
	
	public String toXML(){
		return new XStream().toXML(this);
	}
	
}
