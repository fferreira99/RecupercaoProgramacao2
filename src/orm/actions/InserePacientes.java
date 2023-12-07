package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Paciente;

public class InserePacientes {
	public static void inserir(Paciente paciente) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pacientes");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin(); // Iniciar transação
		manager.persist(paciente); // linha que faz o hibernate inserir um objeto no banco
		manager.getTransaction().commit(); // Encerramento da transação
		
		manager.close();
		factory.close();
		
	}
}
