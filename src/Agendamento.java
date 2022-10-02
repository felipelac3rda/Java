import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Agendamento {
	private int id = 0;
	private Calendar data;
	private Cliente cliente;
	private int hora = 0;
	private int minuto = 0;
	private Cabelereiro cabelereiro;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/y HH:mm:ss");

	public Agendamento(Cliente cliente, Cabelereiro cabelereiro) {
		super();
		this.cliente = cliente;
		this.cabelereiro = cabelereiro;
		setData();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getData() {
		return data;
	}

	public void setData() {
		this.data = Calendar.getInstance();
		setHora();
		setMinuto();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getHora() {
		return hora;
	}

	public void setHora() {
		this.hora = getData().HOUR_OF_DAY;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto() {
		this.minuto = getData().MINUTE;
	}

	public Cabelereiro getCabelereiro() {
		return cabelereiro;
	}

	public void setCabelereiro(Cabelereiro cabelereiro) {
		this.cabelereiro = cabelereiro;
	}
	
	public String toString() {
		String saida="";
		saida+="----------------------------------------------------\n";
		saida+="\n******* Cliente:  *******";
		saida+="\n id: " + this.cliente.getId();
		saida+="\n Nome: " + this.cliente.getNome();
		saida+="\n CPF:  "+ this.cliente.getCpf();
		
		saida+= "\n\n*******  Cabeleiro:  *******  ";
		saida+="\n id: " + this.cabelereiro.getId();
		saida+="\n Nome: " + this.cabelereiro.getNome();
		saida+="\n CPF:  "+ this.cabelereiro.getCpf();
		
		saida+="\n Data do agendamento:  "+ 
		sdf.format(data.getTime());
	
		
		
		
		return saida;
	}

}