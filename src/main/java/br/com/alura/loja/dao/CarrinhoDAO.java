package br.com.alura.loja.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import br.com.alura.loja.modelo.Carrinho;
import br.com.alura.loja.modelo.Produto;

public class CarrinhoDAO {
	
	private static Map<Long, Carrinho> banco = new HashMap<Long, Carrinho>();
	private static AtomicLong contador = new AtomicLong(1);
	
	static {
		Produto videogame = new Produto(6237, "Videogame 4", 4000, 1);
		Produto esporte = new Produto(3467, "Jogo de esporte", 60, 2);
		Carrinho carrinho = new Carrinho()
								.adiciona(videogame)
								.adiciona(esporte)
								.para("Rua Vergueiro 3185, 8 andar", "S‹o Paulo")
								.setId(1l);
		banco.put(1l, carrinho);
	}
	
	public void adiciona(Carrinho carrinho) {
		long id = contador.incrementAndGet();
		carrinho.setId(id);
		banco.put(id, carrinho);
	}
	
	public Carrinho busca(Long id) {
		return banco.get(id);
	}
	
	public Carrinho remove(long id) {
		return banco.remove(id);
	}

}
