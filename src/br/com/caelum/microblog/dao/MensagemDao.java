package br.com.caelum.microblog.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.microblog.model.Mensagem;

public class MensagemDao {

	private static List<Mensagem> mensagens = new ArrayList<>();
	
	static {
		mensagens.add(new Mensagem("Meu primeiro post!"));
		mensagens.add(new Mensagem("Outro post, aqui. Só que bem maior porque eu quero ver o que acontece com o estilo com as descrições maiores."));
		mensagens.add(new Mensagem("E mais um pra animar"));
	}
	
	public List<Mensagem> lista() {
		return mensagens;
	}

	public void adiciona(Mensagem mensagem) {
		mensagens.add(mensagem);
	}
}
