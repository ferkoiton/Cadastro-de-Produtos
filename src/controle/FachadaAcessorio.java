package controle;

import java.util.List;

import dao.AcessorioDAO;
import dao.IDAO;
import model.domain.Acessorio;
import model.domain.EntidadeDominio;

public class FachadaAcessorio implements IFachada{

	@Override
	public String salvar(EntidadeDominio entidade) {
		Acessorio acessorio = (Acessorio) entidade;
		IDAO dao = new AcessorioDAO();
		
		dao.salvar(acessorio);
		
		return "Acessorio salvo.";
	}

	@Override
	public String alterar(EntidadeDominio entidade) {
		Acessorio acessorio = (Acessorio) entidade;
		IDAO dao = new AcessorioDAO();
		
		dao.alterar(acessorio);
		
		return "Acessorio alterado.";
	}

	@Override
	public String excluir(EntidadeDominio entidade) {
		Acessorio acessorio = (Acessorio) entidade;
		IDAO dao = new AcessorioDAO();
		
		dao.excluir(acessorio);
		
		return "Acessorio excluido.";
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) {
		Acessorio acessorio = (Acessorio) entidade;
		IDAO dao = new AcessorioDAO();
		
		dao.consultar(acessorio);
		return null;
	}

}
