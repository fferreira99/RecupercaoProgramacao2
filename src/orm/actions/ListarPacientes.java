package orm.actions;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import orm.modelo.Paciente;

public class ListarPacientes {
	public static List<Paciente> busca(){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pacientes");
		EntityManager manager = factory.createEntityManager();
		
		//Query em JPQL que é traduzida para o SQL do banco definido no persistence.xml
		Query query = manager.createQuery("select a from Paciente as a");
		
		@SuppressWarnings("unchecked")
		List<Paciente> pacientes = query.getResultList();
		
		manager.close();
		factory.close();
		
		return pacientes;
		
	}

}
