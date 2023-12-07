package orm.testes;

import java.util.List;
import orm.actions.ListarPacientes;
import orm.modelo.Paciente;

public class TestaListarPacientes {
	public static void main(String[] args) {
		List<Paciente> pacientes = ListarPacientes.busca();

		if (pacientes.isEmpty()) {
			System.out.println("Nenhum paciente encontrado!");
		} else {
			System.out.println("Pacientes encontrados: ");
			pacientes.stream().forEach(System.out::println);
		}
		
	}

}
