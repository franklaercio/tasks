package br.com.franklaercio.tasks.repository;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.franklaercio.tasks.Task;
import br.com.franklaercio.tasks.TaskRepository;
import junit.framework.TestCase;

public class TesteTaskRepository extends TestCase {
	
	@Autowired
	private Task Task = new Task();
	private TaskRepository taskRepository;
	
	@Test
	public void testSalvar() {
		//task.setTitulo("Teste");
		//task.setDescricao("Teste");
		//taskRepository.save(task);
		//assertNotNull(task);
	}
	
}
