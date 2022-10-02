import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Atendimento {
	private Cliente cliente;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/y HH:mm:ss");
	private Calendar data;
	private Cabelereiro cabelereiro;
	private ArrayList<Servico> servicos = new ArrayList<>();
	private float valorTotal = 0;
	private int numeroDeServicos = 0;

	public Atendimento(Cliente cliente, Cabelereiro cabelereiro) {
		super();
		this.cliente = cliente;
		this.cabelereiro = cabelereiro;
		setData();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Calendar getData() {
		return data;
	}

	public void setData() {
		this.data = Calendar.getInstance();
	}

	public Cabelereiro getCabelereiro() {
		return cabelereiro;
	}

	public void setCabelereiro(Cabelereiro cabelereiro) {
		this.cabelereiro = cabelereiro;
	}

	public void adicionarServico(Servico servico) {
		servicos.add(servico);
		setValorTotal(servico);
	}

	public void setListServico(ArrayList<Servico> lista) {
		servicos = lista;
		setValorTotalCarregadoTeclado(servicos);
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotalCarregadoTeclado(ArrayList<Servico> lista) {
		for (Servico servico : lista) {
			this.valorTotal += servico.getValor();
			setNumeroDeServicos();
		}
	}

	public void setValorTotal(Servico servico) {
		this.valorTotal += servico.getValor();
		setNumeroDeServicos();
	}

	public int getNumeroDeServicos() {
		return numeroDeServicos;
	}

	public void setNumeroDeServicos() {
		this.numeroDeServicos++;
	}

	public Boolean verificarServicoGratuito() {
		for (Servico servico : servicos) {
			if(servico.getValor() == 0) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String saida = "";

		saida += "----------------------------------------------------\n";
		saida += "\n******* Cliente:  *******";
		saida += "\n id: " + this.cliente.getId();
		saida += "\n Nome: " + this.cliente.getNome();
		saida += "\n CPF:  " + this.cliente.getCpf();

		saida += "\n\n*******  Cabeleiro:  *******  ";
		saida += "\n id: " + this.cabelereiro.getId();
		saida += "\n Nome: " + this.cabelereiro.getNome();
		saida += "\n CPF:  " + this.cabelereiro.getCpf();

		saida += "\n\n*******  Servicos:  *******  ";
		for (Servico servico : servicos) {
			saida += "\n id: " + servico.getId();
			saida += "\n nome: " + servico.getNome();
			saida += "\n descricao: " + servico.getDescricao();
			saida += "\n valor: " + servico.getValor() + "\n";
		}

		saida += "----------------------------------------------------";
		saida += "\n numero de servicos total: " + getNumeroDeServicos() + "\n";
		saida += "\n valor total: " + getValorTotal() + "\n";
		if(verificarServicoGratuito()) {
			saida += " Teve serviço gratuito \n";
		}else {
			saida += " Não teve serviço gratuito \n";
		}
		
		saida += "----------------------------------------------------";

		return saida;

	}
}