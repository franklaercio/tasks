package br.com.franklaercio.tasks;

import java.util.ArrayList;
import java.util.List;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "taskController")
@ELBeanName(value = "taskControoler")
@Join(path = "/index", to = "index.jsf")
public class TaskController {
	
	 @Autowired
	 private TaskRepository taskRepository;
	 private List<Task> tasks = new ArrayList<>();
	 private Task task = new Task();
	 
	 public String apagar(int id) {
		 taskRepository.deleteById(id);
		 return "index.xhtml?faces-redirect=true";
	 }
	 
	 public String concluir(int id) {
		 Task tarefa = taskRepository.findById(id).orElse(null);
		 tarefa.setAtiva(true);
		 this.taskRepository.save(tarefa);
		 return "index.xhtml?faces-redirect=true";
	 }
	 
	 public String salvar() {
		 this.taskRepository.save(task);
		 this.task = new Task();
		 return "index.xhtml?faces-redirect=true";
	 }
	 
	 public String update() {
		 this.taskRepository.save(task);
		 this.task = new Task();
		 return "index.xhtml?faces-redirect=true";
	 }

	public List<Task> getTasks() {
		this.tasks = (List<Task>) taskRepository.findAll();
		return this.tasks;
	}
	
	public String isAtiva(int id) {
		Task tarefa = taskRepository.findById(id).orElse(null);
		if(tarefa.isAtiva()) {
			return "Concluída";
		}else {
			return "A Fazer";
		}
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}
	 
}
