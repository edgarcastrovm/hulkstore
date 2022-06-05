package com.hulkstore.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
public class HsVwstock implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pro_id",updatable = false, nullable = false)
	private Long proId;

	@Column(name = "pro_nombre")
	private String proNombre;
	
	@Column(name = "ingreso")
	private int ingreso;
	
	@Column(name = "vendido")
	private int vendido;
	
	@Column(name = "disponible")
	private int disponible;

	public Long getProId() {
		return proId;
	}

	public void setProId(Long proId) {
		this.proId = proId;
	}

	public String getProNombre() {
		return proNombre;
	}

	public void setProNombre(String proNombre) {
		this.proNombre = proNombre;
	}

	public int getIngreso() {
		return ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	public int getVendido() {
		return vendido;
	}

	public void setVendido(int vendido) {
		this.vendido = vendido;
	}

	public int getDisponible() {
		return disponible;
	}

	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}
	
	
}
