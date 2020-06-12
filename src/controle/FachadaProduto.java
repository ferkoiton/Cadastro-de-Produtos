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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String excluir(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		return null;
	}

}
