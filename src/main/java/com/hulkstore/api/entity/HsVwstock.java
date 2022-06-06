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
public class HsVwstock implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pro_id", updatable = false, nullable = false)
	private Long proId;

	@Column(name = "pro_nombre")
	private String proNombre;

	@Column(name = "pro_image")
	private String proImage;

	@Column(name = "pro_valor")
	private String proValor;

	@Column(name = "tip_nombre")
	private String tipNombre;

	@Column(name = "tip_id")
	private Long tipId;

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

	public String getProImage() {
		return proImage;
	}

	public void setProImage(String proImage) {
		this.proImage = proImage;
	}

	public String getProValor() {
		return proValor;
	}

	public void setProValor(String proValor) {
		this.proValor = proValor;
	}

	public String getTipNombre() {
		return tipNombre;
	}

	public void setTipNombre(String tipNombre) {
		this.tipNombre = tipNombre;
	}

	public Long getTipId() {
		return tipId;
	}

	public void setTipId(Long tipId) {
		this.tipId = tipId;
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
