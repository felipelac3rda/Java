import java.util.ArrayList;

public class Cliente {
	private int id = 0;
	private String nome = "";
	private String cpf = "";

	public Cliente(String cpf) {
		super();
		this.cpf = cpf;
	}

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
		if (nome.length() >= 3) {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}