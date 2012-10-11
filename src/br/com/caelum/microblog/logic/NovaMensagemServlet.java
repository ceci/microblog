package br.com.caelum.microblog.logic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.microblog.dao.MensagemDao;
import br.com.caelum.microblog.model.Mensagem;

@WebServlet("/novaMensagem")
public class NovaMensagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String descricao = request.getParameter("mensagem.descricao");
		Mensagem mensagem = new Mensagem(descricao);
		
		new MensagemDao().adiciona(mensagem);
		
		response.sendRedirect(request.getContextPath() + "/timeline.jsp");
	}
}
