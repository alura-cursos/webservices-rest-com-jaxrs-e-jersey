package br.com.alura.loja.modelo;

import com.thoughtworks.xstream.XStream;

public class Projeto {

	private String nome;
	private long id;
	private int anoDeInicio;
	
	//constructors
	public Projeto() {}
	public Projeto(String nome, long id, int anoDeInicio) {
		this.nome = nome;
		this.id = id;
		this.anoDeInicio = anoDeInicio;
	}
	
	//getters
	public String getNome() {return nome;}
	public long getId() {return id;}
	public int getAnoDeInicio() {return anoDeInicio;}
	
	//setters
	public void setId(long id) {this.id = id;}
	
	//methods
	public String toXML() {
		return new XStream().toXML(this);
	}
}
