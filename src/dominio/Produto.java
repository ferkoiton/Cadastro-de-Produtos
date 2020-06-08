package dominio;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Produto {
	
	private Integer id;
	private String nome;
	private Double valorCompra;
	private Date dataEntrada;
	private Integer quantidade;
	private String comprador;
	
	private List<Acessorio> acessorio = new ArrayList<>();
	private FichaTecnica fichaTecnica;
	private Linha linha;
	
	public Produto() {
	}

	public Produto(Integer id, String nome, Double valorCompra, Date dataEntrada, Integer quantidade, String comprador,
			FichaTecnica fichaTecnica, Linha linha) {
		this.id = id;
		this.nome = nome;
		this.valorCompra = valorCompra;
		this.dataEntrada = dataEntrada;
		this.quantidade = quantidade;
		this.comprador = comprador;
		this.fichaTecnica = fichaTecnica;
		this.linha = linha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
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
