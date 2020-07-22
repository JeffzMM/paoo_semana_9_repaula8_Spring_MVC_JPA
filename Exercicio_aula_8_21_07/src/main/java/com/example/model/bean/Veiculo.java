package com.example.model.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_veiculo")
public class Veiculo {


	@Id
	@GeneratedValue
	private Long id;
	@Column (nullable = false, length = 50)
	String marca;
	@Column (nullable = false, length = 50)
	String modelo;
	@Column (nullable = false, length = 10)
	String Ano;
	
	
	//Sem classe associativa
	
	@ManyToMany
	@JoinTable (name = "tb_veiculo_reboque", 
				joinColumns = @JoinColumn (name = "id_veiculo"), 
				inverseJoinColumns = @JoinColumn (name = "id_reboque"))
	private List <Reboque> reboques;
	
	public List<Reboque> getReboques() {
		return reboques;
	}
	
	public void setConteudos(List<Reboque> reboques) {
		this.reboques = reboques;
	}
	
	
	
	// com classe associativa
	
	@OneToMany (mappedBy = "veiculo")
	private List<Aluguel> alugueis;
	
	public List<Aluguel> getAluguel() {
		return alugueis;
	}
	
	public void setConsumos(List<Aluguel> alugueis) {
		this.alugueis = alugueis;
	}
	
	
	
	@ManyToOne
	private Pessoa pessoa;

	@OneToOne
	@JoinColumn (name= "id_da_placa")
	private Placa placa;
	
	public Placa getPlaca() {
		return placa;
	}
	public void setPlaca(Placa placa) {
		this.placa = placa;
	}
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return Ano;
	}

	public void setAno(String ano) {
		Ano = ano;
	}
	
		
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}


