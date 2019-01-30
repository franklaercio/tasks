/**
 * 
 */
package br.com.franklaercio.tasks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Frank Laércio
 *
 */
@Entity
public class Task {
	
	@Id
	@GeneratedValue
	private int id;
	private String titulo;
	private String descricao;
	private boolean ativa;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	public Task() {
		
	}
	
	public Task(String titulo, String descricao, boolean ativa) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the ativa
	 */
	public boolean isAtiva() {
		return ativa;
	}
	/**
	 * @param ativa the ativa to set
	 */
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	
}
