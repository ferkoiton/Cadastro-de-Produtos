package dominio;

public class Componente {
	
	private Integer id;
	private String compBasico;
	private String compPrimario;
	private String compSecundario;

	public Componente() {	
	}

	public Componente(Integer id, String compBasico, String compPrimario, String compSecundario) {
		this.id = id;
		this.compBasico = compBasico;
		this.compPrimario = compPrimario;
		this.compSecundario = compSecundario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompBasico() {
		return compBasico;
	}

	public void setCompBasico(String compBasico) {
		this.compBasico = compBasico;
	}

	public String getCompPrimario() {
		return compPrimario;
	}

	public void setCompPrimario(String compPrimario) {
		this.compPrimario = compPrimario;
	}

	public String getCompSecundario() {
		return compSecundario;
	}

	public void setCompSecundario(String compSecundario) {
		this.compSecundario = compSecundario;
	}
	
}
