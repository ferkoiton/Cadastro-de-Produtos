package dominio;

public class Linha {
	
	private String descricao;
	
	public Linha() {
	}

	public Linha(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
