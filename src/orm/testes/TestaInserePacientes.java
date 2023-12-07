package orm.testes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import orm.actions.InserePacientes;
import orm.modelo.Paciente;

public class TestaInserePacientes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // padrão da entrada de dados
		
		Paciente paciente = new Paciente();
		
		System.out.print("Nome: ");
		paciente.setNome(sc.nextLine());
		
		while (true) {
			System.out.print("Cpf (11 digitos sem pontos ou traços): ");
			String cpf = sc.nextLine();
			if (cpf.length() == 11) {
				paciente.setCpf(cpf);
				break;
			}
		}
		
		System.out.print("Email: ");
		paciente.setEmail(sc.nextLine());
		
		System.out.print("Endereco: ");
		paciente.setEndereco(sc.nextLine());
		
		System.out.print("Naturalidade: ");
		paciente.setNaturalidade(sc.nextLine());
		
		while (true) {
			try {
				System.out.print("Data de Nascimento (dd/MM/yyyy): ");
				paciente.setDataNascimento(LocalDate.parse(sc.nextLine(), fmt1));
				break;
			} catch (DateTimeParseException e) {
				System.out.println("O formato da data inserido está errado, o correto seria dd/MM/yyyy,"
						+ "insira novamente a data nesse formato");
			}
		}
		
		System.out.print("Diagnóstico: ");
		paciente.setDiagnostico(sc.nextLine());
		
		InserePacientes.inserir(paciente);
	
	}

}
