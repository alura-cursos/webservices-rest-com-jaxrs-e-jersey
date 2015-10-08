package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import junit.framework.Assert;

import org.junit.Test;

public class ClienteTest {
	
	@Test
	public void testaQueAConexaoComOServidorFunciona(){
		
		Client cliente = ClientBuilder.newClient();
		WebTarget target = cliente.target("http://www.mocky.io");
		String conteudo = target.path("/v2/52aaf5deee7ba8c70329fb7d").request().get(String.class);
		
		Assert.assertTrue(conteudo.contains("<rua>Rua Vergueiro 3185"));
		
	}

}
