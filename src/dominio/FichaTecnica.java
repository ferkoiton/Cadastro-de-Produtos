package dominio;

public class FichaTecnica extends EntidadeDominio {
	
	private String categoria;
	private String subCategoria;
	private String nome;
	private String observacoes;
	private Linha linhaFicha;
	private Componente componente;
	
	public FichaTecnica() {
	}

	public FichaTecnica(int id, String descricao, String categoria, String subCategoria, String nome,
			String observacoes, Linha linhaFicha, Componente componente) {
		super(id, descricao);
		this.categoria = categoria;
		this.subCategoria = subCategoria;
		this.nome = nome;
		this.observacoes = observacoes;
		this.linhaFicha = linhaFicha;
		this.componente = componente;
	}



	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Linha getLinhaFicha() {
		return linhaFicha;
	}

	public void setLinhaFicha(Linha linhaFicha) {
		this.linhaFicha = linhaFicha;
	}

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}	
	
	
}
