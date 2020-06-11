package dominio;

public class Acessorio extends EntidadeDominio {
	
	private String nome;
	private Integer quantidade;
	private Linha acessorioLinha;
	
	public Acessorio() {
	}

	public Acessorio(int id, String descricao, String nome, Integer quantidade, Linha acessorioLinha) {
		super(id, descricao);
		this.nome = nome;
		this.quantidade = quantidade;
		this.acessorioLinha = acessorioLinha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Linha getAcessorioLinha() {
		return acessorioLinha;
	}

	public void setAcessorioLinha(Linha acessorioLinha) {
		this.acessorioLinha = acessorioLinha;
	}

}
