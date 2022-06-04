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
@Table(name = "hs_item_venta")
public class HsItemVenta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "itv_id")
	private Long itvId;

	@OneToOne
	@JoinColumn(name = "itp_id")
	private HsItemProducto itpId;

	@OneToOne
	@JoinColumn(name = "ven_id")
	private HsVenta venId;

	@Column(name = "itv_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date itvFecha;

	@Column(name = "itv_estado")
	private String itvEstado;

	@PrePersist
	public void prePersist() {
		this.itvFecha = new Date();
		this.itvEstado = "SALIDA";
	}

	public Long getItvId() {
		return itvId;
	}

	public void setItvId(Long itvId) {
		this.itvId = itvId;
	}

	public HsItemProducto getItpId() {
		return itpId;
	}

	public void setItpId(HsItemProducto itpId) {
		this.itpId = itpId;
	}

	public HsVenta getVenId() {
		return venId;
	}

	public void setVenId(HsVenta venId) {
		this.venId = venId;
	}

	public Date getItvFecha() {
		return itvFecha;
	}

	public void setItvFecha(Date itvFecha) {
		this.itvFecha = itvFecha;
	}

	public String getItvEstado() {
		return itvEstado;
	}

	public void setItvEstado(String itvEstado) {
		this.itvEstado = itvEstado;
	}

}
