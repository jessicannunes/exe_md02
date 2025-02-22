package com.devsuperior.exm02.entites;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class AtividadeParticipantePk {
	
	@ManyToOne
	@JoinColumn(name = "atividade_id")
	private Atividade atividade;
	
	@ManyToOne
	@JoinColumn(name = "participante_id")
	private Participante participante;
	
	public AtividadeParticipantePk() {
		
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}
	
	
}
