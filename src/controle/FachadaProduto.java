package controle;

import java.util.List;

import dao.IDAO;
import dao.ProdutoDAO;
import model.domain.EntidadeDominio;
import model.domain.Produto;

public class FachadaProduto implements IFachada{

	@Override
	public String salvar(EntidadeDominio entidade) {
		
		Produto produto = (Produto) entidade;
		IDAO dao = new ProdutoDAO();
		
		dao.salvar(produto);
		
		return "Produto salvo com sucesso.";
	}

	@Override
	public String alterar(EntidadeDominio entidade) {
		
		Produto produto = (Produto) entidade;
		IDAO dao = new ProdutoDAO();
		
		dao.alterar(produto);
		
		return "Produto alterado.";
	}

	@Override
	public String excluir(EntidadeDominio entidade) {
		Produto produto = (Produto) entidade;
		IDAO dao = new ProdutoDAO();
		
		dao.excluir(produto);
		
		return "Produto excluido";
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) {
		Produto produto = (Produto) entidade;
		IDAO dao = new ProdutoDAO();
		
		dao.consultar(produto);
		return null;
	}

}
