package br.com.fiap.gs1.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_viagens")
public class Viagem {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "titulo")
	private String title;

	@Column(name = "autor", length = 100, nullable = false)
	private String author;

	@OneToMany
	private List<Comment> comments;

	@Transient
	private String colunaComposta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public String getColunaComposta() {
		return colunaComposta;
	}

	public void setColunaComposta(String colunaComposta) {
		this.colunaComposta = colunaComposta;
	}
	
	

}
