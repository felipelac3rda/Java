public class Servico {
	private int id = 0;
	private String nome = "";
	private float valor = 0;
	private String descricao = "";


	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() >= 5) {
			this.nome = nome;
		}
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		if (valor >= 0) {
			this.valor = valor;
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() >= 10) {
			this.descricao = descricao;
		}

		this.descricao = descricao;
	}
	

}