package com.example.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table (name = "tb_placa")
public class Placa {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long identificador;
	private String cidade;
	
	
	public Long getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Placa other = (Placa) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Placa [identificador=" + identificador + ", cidade=" + cidade + "]";
	}
	
	
	
	
	
}
