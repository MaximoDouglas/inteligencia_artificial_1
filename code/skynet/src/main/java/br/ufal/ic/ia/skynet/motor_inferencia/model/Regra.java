package br.ufal.ic.ia.skynet.motor_inferencia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Regra {

	@Id
	@GeneratedValue
	private int id;
	
	private String antescedente;
	private String consequente;
	
	public Regra() {}
	
	public Regra(String antes, String cons) {
		this.antescedente = antes;
		this.consequente = cons;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAntecedente() {
		return antescedente;
	}
	
	public void setAntecedente(String antecedente) {
		this.antescedente = antecedente;
	}
	
	public String getConsequente() {
		return consequente;
	}
	
	public void setConsequente(String consequente) {
		this.consequente = consequente;
	}
	
}
