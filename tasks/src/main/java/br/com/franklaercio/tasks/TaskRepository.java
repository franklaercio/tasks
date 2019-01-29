/**
 * 
 */
package br.com.franklaercio.tasks;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Frank
 *
 */
public interface TaskRepository extends CrudRepository<Task, Integer>{
	
}
