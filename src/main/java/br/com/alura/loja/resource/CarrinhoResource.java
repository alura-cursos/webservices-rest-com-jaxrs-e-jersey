package br.com.alura.loja.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.thoughtworks.xstream.XStream;

import br.com.alura.loja.dao.CarrinhoDAO;
import br.com.alura.loja.modelo.Carrinho;

@Path("carrinhos")
@Produces(MediaType.APPLICATION_XML)
public class CarrinhoResource {
	@GET
	public String busca() {
		Carrinho carrinho = new CarrinhoDAO().busca(1l);
        return carrinho.toXML();
	}
}
