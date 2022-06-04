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
@Table(name = "hs_tarjeta_cliente")
public class HsTarjetaCliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tac_id")
	private Long tacId;

	@Column(name = "tac_tipo")
	private String tacTipo;

	@Column(name = "tac_numero")
	private String tacNumero;

	@Column(name = "tac_code")
	private String tacCode;

	@ManyToOne
	@JoinColumn(name = "cli_id")
	private HsCliente cliId;

	@Column(name = "tac_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date tacFecha;

	@Column(name = "tac_estado")
	private String tacEstado;

	@PrePersist
	public void prePersist() {
		this.tacFecha = new Date();
		this.tacEstado = "ACTIVO";
	}

	public Long getTacId() {
		return tacId;
	}

	public void setTacId(Long tac_id) {
		this.tacId = tac_id;
	}

	public String getTacTipo() {
		return tacTipo;
	}

	public void setTacTipo(String tacTipo) {
		this.tacTipo = tacTipo;
	}

	public String getTacNumero() {
		return tacNumero;
	}

	public void setTacNumero(String tacNumero) {
		this.tacNumero = tacNumero;
	}

	public String getTacCode() {
		return tacCode;
	}

	public void setTacCode(String tacCode) {
		this.tacCode = tacCode;
	}

	public HsCliente getCliId() {
		return cliId;
	}

	public void setCliId(HsCliente cliId) {
		this.cliId = cliId;
	}

	public Date getTacFecha() {
		return tacFecha;
	}

	public void setTacFecha(Date tacFecha) {
		this.tacFecha = tacFecha;
	}

	public String getTacEstado() {
		return tacEstado;
	}

	public void setTacEstado(String tacEstado) {
		this.tacEstado = tacEstado;
	}

}
