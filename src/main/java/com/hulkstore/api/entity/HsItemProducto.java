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
@Table(name = "hs_item_producto")
public class HsItemProducto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "itp_id")
	private Long itpId;

	@Column(name = "itp_serie")
	private String itpSerie;

	@ManyToOne
	@JoinColumn(name = "pro_id")
	private HsProducto proId;
	
	@Column(name = "itv_unidad")
	private int itvUnidad;

	@Column(name = "itp_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date itpFecha;

	@Column(name = "itp_estado")
	private String itpEstado;

	@PrePersist
	public void prePersist() {
		this.itpFecha = new Date();
		this.itpEstado = "ACTIVO";
		this.itvUnidad = 1;
	}

	public Long getItpId() {
		return itpId;
	}

	public void setItpId(Long itpId) {
		this.itpId = itpId;
	}

	public String getItpSerie() {
		return itpSerie;
	}

	public void setItpSerie(String itpSerie) {
		this.itpSerie = itpSerie;
	}

	public HsProducto getProId() {
		return proId;
	}

	public void setProId(HsProducto proId) {
		this.proId = proId;
	}

	public int getItvUnidad() {
		return itvUnidad;
	}

	public void setItvUnidad(int itvUnidad) {
		this.itvUnidad = itvUnidad;
	}

	public Date getItpFecha() {
		return itpFecha;
	}

	public void setItpFecha(Date itpFecha) {
		this.itpFecha = itpFecha;
	}

	public String getItpEstado() {
		return itpEstado;
	}

	public void setItpEstado(String itpEstado) {
		this.itpEstado = itpEstado;
	}

}
