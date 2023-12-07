package orm.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pacientes")
public class Paciente {
	
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	private String email;
	private String cpf;
	private LocalDate dataNascimento;
	private String naturalidade;
	private String endereco;
	private String diagnostico; 
	
	public Paciente(long id, String nome, String email, String cpf, LocalDate dataNascimento, String naturalidade,
			String endereco, String diagnostico) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
		this.diagnostico = diagnostico;
		
	}
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco; 
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico; 
	}
	
	
	@Override
	public String toString() {
		return "id = " + id + ", nome = " + nome + ", email = " + email + ", cpf = " + cpf.formatted("xxx.xxx.xxx-xx", cpf) + ", dataNascimento = "
				+ dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
				+ ", naturalidade = " + naturalidade + ", endereco = " + endereco + ", diagnostico = " + diagnostico;
	}
	
}
