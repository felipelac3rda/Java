import java.util.ArrayList;

public class Balanco {
	private ArrayList<Atendimento> atendimentos = new ArrayList<>();


	public void adicionarAtendimento(Atendimento atendimento) {
		atendimentos.add(atendimento);
	}
	
	public Boolean verificarNomeClienteCabelereiro() {
		for (Atendimento atendimento : atendimentos) {
			if(atendimento.getCliente().getNome().equals(atendimento.getCabelereiro().getNome())){
				return true;
			}
		}
		return false;
		}
	
	
	
	
	public String toString() {
		String saida = "";
		saida += "---------------------Balanco------------------------\n";
		if(verificarNomeClienteCabelereiro()) {
			saida+= "Existe um nome do cliente igual o nome do Cabelereiro\n";
		}else {
			saida+= "Não existe um nome do cliente igual o nome do Cabelereiro \n";
		}
		saida += "----------------------------------------------------\n";
		
		
		return saida;
	}












}
