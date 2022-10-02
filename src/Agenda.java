import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Agenda {
	ArrayList<Agendamento> agendamentos = new ArrayList<>();
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/y HH:mm:ss");
	
	public void adicionarAgendamentos(Agendamento agendamento){
		agendamentos.add(agendamento);
	}
	
	public String toString() {
		String saida = "";
		
		saida += "------------------- Agenda --------------------\n";
		for (Agendamento agendamento : agendamentos) {
			saida += "\n id: " + agendamento.getId();
		
			saida += "\n Cliente: " + agendamento.getCliente().getNome() + "\n";
			saida += "\n Data: " + sdf.format(agendamento.getData().getTime()) + "\n";
		}
		
		
		saida += "-----------------------------------------------\n";
		
		return saida;
	}
	
	
	
	
}
