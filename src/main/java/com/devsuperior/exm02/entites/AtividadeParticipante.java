package com.devsuperior.exm02.entites;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_atividade_participante")
public class AtividadeParticipante {
	
	@EmbeddedId
	private AtividadeParticipantePk id = new AtividadeParticipantePk();
	
	private String nomeatividade;
	private String nomeparticipante;
	
	public AtividadeParticipante() {
		
	}

	public AtividadeParticipante(Atividade atividade, Participante participante, String nomeatividade, String nomeparticipante) {
		
		id.setAtividade(atividade);
		id.setParticipante(participante);
		this.nomeatividade = nomeatividade;
		this.nomeparticipante = nomeparticipante;
	}
	
	public Atividade getAtividade() {
		return id.getAtividade();
	}
	
	public void setAtividade(Atividade atividade) {
		id.setAtividade(atividade);
	}
	
	public Participante getParticipante() {
		return id.getParticipante();
	}
	
	public void setParticipante(Participante participante) {
		id.setParticipante(participante);
	}

	public String getNomeatividade() {
		return nomeatividade;
	}

	public void setNomeatividade(String nomeatividade) {
		this.nomeatividade = nomeatividade;
	}

	public String getNomeparticipante() {
		return nomeparticipante;
	}

	public void setNomeparticipante(String nomeparticipante) {
		this.nomeparticipante = nomeparticipante;
	}

	
	
	
	
}
