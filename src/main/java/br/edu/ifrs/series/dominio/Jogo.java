package br.edu.ifrs.series.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String desenvolvedora;
	private Integer anoLancamento;
	private String plataforma;
	
	
	public Jogo() {}
	
	public Jogo(String nome, String desenvolvedora, Integer anoLancamento, String plataforma) {
		setNome(nome);
		setDesenvolvedora(desenvolvedora);
		setAnoLancamento(anoLancamento);
		setPlataforma(plataforma);
	}

	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		return "Jogo [id=" + id + ", nome=" + nome + ", desenvolvedora=" + desenvolvedora + ", anoLancamento="
				+ anoLancamento + ", plataforma=" + plataforma + "]";
	}
}