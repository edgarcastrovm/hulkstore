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
@Table(name = "hs_pago")
public class HsPago implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pag_id")
	private Long pagId;
	
	@ManyToOne
	@JoinColumn(name = "tacId")
	private HsTarjetaCliente tacId;

	@Column(name = "pag_referencia")
	private String tacNumero;

	@Column(name = "pag_valor_compra")
	private Double pagValorCompra;
	
	@Column(name = "pag_valor_adicional")
	private Double pagValorAdicional;
	
	@Column(name = "pag_valor_total")
	private Double pagValorTotal;

	@Column(name = "pag_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date pagFecha;

	@Column(name = "pag_estado")
	private String pagEstado;

	@PrePersist
	public void prePersist() {
		this.pagFecha = new Date();
		this.pagEstado = "ACTIVO";
	}

	public Long getPagId() {
		return pagId;
	}

	public void setPagId(Long pagid) {
		this.pagId = pagid;
	}

	public HsTarjetaCliente getTacId() {
		return tacId;
	}

	public void setTacId(HsTarjetaCliente tacId) {
		this.tacId = tacId;
	}

	public String getTacNumero() {
		return tacNumero;
	}

	public void setTacNumero(String tacNumero) {
		this.tacNumero = tacNumero;
	}

	public Double getPagValorCompra() {
		return pagValorCompra;
	}

	public void setPagValorCompra(Double pagValorCompra) {
		this.pagValorCompra = pagValorCompra;
	}

	public Double getPagValorAdicional() {
		return pagValorAdicional;
	}

	public void setPagValorAdicional(Double pagValorAdicional) {
		this.pagValorAdicional = pagValorAdicional;
	}

	public Double getPagValorTotal() {
		return pagValorTotal;
	}

	public void setPagValorTotal(Double pagValorTotal) {
		this.pagValorTotal = pagValorTotal;
	}

	public Date getPagFecha() {
		return pagFecha;
	}

	public void setPagFecha(Date pagFecha) {
		this.pagFecha = pagFecha;
	}

	public String getPagEstado() {
		return pagEstado;
	}

	public void setPagEstado(String pagEstado) {
		this.pagEstado = pagEstado;
	}

}
