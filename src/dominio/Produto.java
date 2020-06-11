package dominio;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Produto extends EntidadeDominio {
	
	private String nome;
	private Double valorCompra;
	private Date dataEntrada;
	private int quantidade;
	private String comprador;
	
	private List<Acessorio> acessorio = new ArrayList<>();
	private FichaTecnica fichaTecnica;
	private Linha linha;
	
	public Produto() {
	}
	
	public Produto(int id, String nome, Double valorCompra, String descricao, Date dataEntrada, int quantidade, String comprador,
			FichaTecnica fichaTecnica, Linha linha) {
		super(id, descricao);
		this.nome = nome;
		this.valorCompra = valorCompra;
		this.dataEntrada = dataEntrada;
		this.quantidade = quantidade;
		this.comprador = comprador;
		this.fichaTecnica = fichaTecnica;
		this.linha = linha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public List<Acessorio> getAcessorio() {
		return acessorio;
	}

	public void addAcessorio(Acessorio acessorio) {
		this.acessorio.add(acessorio);
	}
	
	public void removeAcessorio(Acessorio acessorio) {
		this.acessorio.remove(acessorio);
	}

	public FichaTecnica getFichaTecnica() {
		return fichaTecnica;
	}

	public void setFichaTecnica(FichaTecnica fichaTecnica) {
		this.fichaTecnica = fichaTecnica;
	}

	public Linha getLinha() {
		return linha;
	}

	public void setLinha(Linha linha) {
		this.linha = linha;
	}
	
	
	
	
}
