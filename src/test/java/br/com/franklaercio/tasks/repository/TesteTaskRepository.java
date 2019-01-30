package br.com.franklaercio.tasks.repository;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.franklaercio.tasks.Task;
import br.com.franklaercio.tasks.TaskRepository;
import junit.framework.TestCase;

/**
 * @author Frank
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace =Replace.NONE )
public class TesteTaskRepository extends TestCase {
	
	@Autowired
	private TaskRepository taskRepository;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Executando Teste!");
	}
	
	@After
	public void after() {
		System.out.println("Fim do Teste!");
	}
	
	@Test
	public void testSalvar() {
		Task task = new Task("Teste", "Teste", true);
		taskRepository.save(task);
		Assert.assertNotNull(task.getId());
	}
	
	@Test
	public void testApagar() {
		Task task = new Task("Teste", "Teste", true);
		taskRepository.save(task);
		Task pesquisaTask = taskRepository.findById(task.getId()).orElse(null);
		taskRepository.deleteById(pesquisaTask.getId());
		Assert.assertNull(pesquisaTask.getId());
	}
	
	@Test
	public void testUpdate() {
		Task task = new Task("Teste", "Teste", true);
		task.setTitulo("Um Título");
		task.setDescricao("Uma descrição");
		task.setAtiva(false);
		Assert.assertEquals(false, task.isAtiva());
		Assert.assertEquals("Um Título", task.getTitulo());
		Assert.assertEquals("Uma descrição", task.getDescricao());
	}
}
