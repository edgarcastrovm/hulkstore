package com.hulkstore.api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "hs_venta")
public class HsVenta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ven_id")
	private Long venId;

	@Column(name = "ven_numero")
	private Long venNumero;
	
	@OneToOne
	@JoinColumn(name = "pag_id")
	private HsPago pagId;
	
	@Column(name = "ven_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date venFecha;

	@Column(name = "ven_estado")
	private String venEstado;

	@PrePersist
	public void prePersist() {
		this.venFecha = new Date();
		this.venEstado = "ACTIVO";
	}

	public Long getVenId() {
		return venId;
	}

	public void setVenId(Long venId) {
		this.venId = venId;
	}

	public Long getVenNumero() {
		return venNumero;
	}

	public void setVenNumero(Long venNumero) {
		this.venNumero = venNumero;
	}

	public HsPago getPagId() {
		return pagId;
	}

	public void setPagId(HsPago pagId) {
		this.pagId = pagId;
	}

	public Date getVenFecha() {
		return venFecha;
	}

	public void setVenFecha(Date venFecha) {
		this.venFecha = venFecha;
	}

	public String getVenEstado() {
		return venEstado;
	}

	public void setVenEstado(String venEstado) {
		this.venEstado = venEstado;
	}

}
