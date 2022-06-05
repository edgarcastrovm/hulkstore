package com.hulkstore.api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "hs_producto")
public class HsProducto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pro_id")
	private Long proId;

	@Column(name = "pro_nombre")
	private String proNombre;
	
	@Column(name = "pro_image")
	private String proImage;

	@ManyToOne
	@JoinColumn(name = "tip_id")
	private HsTipoProducto tipId;
	
	@Column(name = "pro_valor")
	private Double proValor;

	@Column(name = "pro_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date proFecha;

	@Column(name = "pro_estado")
	private String proEstado;

	@PrePersist
	public void prePersist() {
		this.proFecha = new Date();
		this.proEstado = "ACTIVO";
	}

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

	public HsTipoProducto getTipId() {
		return tipId;
	}

	public void setTipId(HsTipoProducto tipId) {
		this.tipId = tipId;
	}

	public Double getProValor() {
		return proValor;
	}

	public void setProValor(Double proValor) {
		this.proValor = proValor;
	}

	public Date getProFecha() {
		return proFecha;
	}

	public void setProFecha(Date proFecha) {
		this.proFecha = proFecha;
	}

	public String getProEstado() {
		return proEstado;
	}

	public void setProEstado(String proEstado) {
		this.proEstado = proEstado;
	}

}
