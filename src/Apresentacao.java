import java.util.ArrayList;
import java.util.Scanner;


public class Apresentacao {

	public static void main(String[] args) {
		Apresentacao a = new Apresentacao();
		
		
		/* Questao 1 */
		Agendamento agendamento = a.carregarDadosParaAgendamento();
		System.out.println(agendamento);
		Atendimento atendimento = a.carregarDadosParaAtendimento();
		System.out.println(atendimento);
		

		
		/* Questao 2 */
		//Atendimento atendimento2 = a.carregarDadosDoTecladoParaAtendimento();
		//System.out.println(atendimento2);

		Atendimento atendimento3 = a.carregarDadosDoTecladoParaAtendimento();
		System.out.println(atendimento3);
		
		
		
		
		
		
		Balanco balanco = new Balanco();
		Agenda agenda = new Agenda();
		//balanco.adicionarAtendimento(atendimento2);
		balanco.adicionarAtendimento(atendimento3);
		agenda.adicionarAgendamentos(agendamento);
		System.out.println(balanco);
		System.out.println(agenda);
	}


	
	
	private Agendamento carregarDadosParaAgendamento() {
		Cliente cliente = new Cliente("078.067.463-40");
		cliente.setId(1);
		cliente.setNome("Felipe");
		Cabelereiro cabelereiro = new Cabelereiro("Ana", "033.333.333-13");
		cabelereiro.setId(1);

		Agendamento agendamento = new Agendamento(cliente, cabelereiro);
		return agendamento;
	}

	private Atendimento carregarDadosParaAtendimento() {
		Cliente cliente1 = new Cliente("080.388.788-95");
		cliente1.setId(1);
		cliente1.setNome("Pedro");

		Servico servico1 = new Servico();
		servico1.setId(1);
		servico1.setNome("Corte de cabelo");
		servico1.setDescricao("Corte de cabelo legal");
		servico1.setValor(150);

		Servico servico2 = new Servico();
		servico2.setId(2);
		servico2.setNome("Hidratação facial");
		servico2.setDescricao(
				"Hidratante Antissinais para redução de linhas de expressão, suavizando sinais de cansaço");
		servico2.setValor(100);

		Servico servico3 = new Servico();
		servico3.setId(3);
		servico2.setNome("Massagem relaxante");
		servico3.setDescricao(
				"Trata-se de manobras especializadas empregadas no músculo, conferindo ao indivíduo relaxamento e alívio muscular. Além de produzir efeitos nos sistemas muscular e nervoso, essa massagem age com eficácia nos sistemas linfático, circulatório e respiratório.");
		servico3.setValor(100);

		Cabelereiro cabeleireiro1 = new Cabelereiro("Antonio", "044.444.444-55");

		Atendimento atendimento1 = new Atendimento(cliente1, cabeleireiro1);
		atendimento1.adicionarServico(servico1);
		atendimento1.adicionarServico(servico2);
		atendimento1.adicionarServico(servico3);

		return atendimento1;
	}

	public Cliente carregarCliente(Scanner entrada) {
		System.out.println("Informe o cliente: ");
		System.out.print("cpf do cliente: ");
		Cliente c = new Cliente(entrada.next());
		System.out.print("\nid do cliente: ");
		c.setId(entrada.nextInt());
		System.out.print("\nnome do cliente: ");
		c.setNome(entrada.next());
		System.out.println("\n\n");
		return c;
	}

	public ArrayList<Servico> carregarServico(Scanner entrada) {
		ArrayList<Servico> aux = new ArrayList<Servico>();
		System.out.println("Informe dados sobre os servico(s)");
		String op = "";
		do {
			Servico s = new Servico();
			System.out.print("\nNome do servico:");
			s.setNome(entrada.next());
			
			System.out.print("\nid do servico:");
			s.setId(entrada.nextInt());

			System.out.print("\nDescricao do servico:");
			s.setDescricao(entrada.next());

			System.out.print("\nValor do servico:");
			s.setValor(entrada.nextFloat());

			aux.add(s);
			System.out.println("Digite \"sair\" ou qualquer tecla para adicionar novo servico:");
			op = entrada.next();
			
		} while (!(op.equals("sair")));
		return aux;
	}

	public Atendimento carregarDadosDoTecladoParaAtendimento() {
		Scanner entrada = new Scanner(System.in);
		Cliente cliente = carregarCliente(entrada);
		Cabelereiro cabelereiro = carregarCabelereiro(entrada);
		Atendimento a = new Atendimento(cliente, cabelereiro);
		a.setListServico(carregarServico(entrada));
		return a;
	}

	private Cabelereiro carregarCabelereiro(Scanner entrada) {

		System.out.println("Informe o cabeleireiro: ");
		System.out.print("\nnome do cabeleireiro: ");
		String nome = entrada.next();
		System.out.print("\ncpf do cabeleireiro: ");
		String cpf = entrada.next();
		Cabelereiro c = new Cabelereiro(nome, cpf);

		System.out.print("\nid do cabeleireiro: ");
		c.setId(entrada.nextInt());

		return c;
	}

}