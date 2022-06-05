package com.hulkstore.api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "hs_cliente")
public class HsCliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cli_id")
	private Long cliId;

	@Column(name = "cli_nombre")
	private String cliNombre;

	@Column(name = "cli_apellido")
	private String cliApellido;

	@Column(name = "cli_dni")
	private String cliDni;

	@Column(name = "cli_email")
	private String cliEmail;
	
	@Column(name = "cli_password")
	private String cliPassword;

	@Column(name = "cli_pais")
	private String cliPais;

	@Column(name = "cli_direccion")
	private String cliDireccion;

	@Column(name = "cli_postal")
	private String cliPostal;

	@Column(name = "cli_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date cliFecha;

	@Column(name = "cli_estado")
	private String cliEstado;

	@PrePersist
	public void prePersist() {
		this.cliFecha = new Date();
		this.cliEstado = "ACTIVO";
	}

	public Long getCliId() {
		return cliId;
	}

	public void setCliId(Long cliId) {
		this.cliId = cliId;
	}

	public String getCliNombre() {
		return cliNombre;
	}

	public void setCliNombre(String cliNombre) {
		this.cliNombre = cliNombre;
	}

	public String getCliApellido() {
		return cliApellido;
	}

	public void setCliApellido(String cliApellido) {
		this.cliApellido = cliApellido;
	}

	public String getCliDni() {
		return cliDni;
	}

	public void setCliDni(String cliDni) {
		this.cliDni = cliDni;
	}

	public String getCliEmail() {
		return cliEmail;
	}

	public void setCliEmail(String cliEmail) {
		this.cliEmail = cliEmail;
	}

	public String getCliPassword() {
		return cliPassword;
	}

	public void setCliPassword(String cliPassword) {
		this.cliPassword = cliPassword;
	}

	public String getCliPais() {
		return cliPais;
	}

	public void setCliPais(String cliPais) {
		this.cliPais = cliPais;
	}

	public String getCliDireccion() {
		return cliDireccion;
	}

	public void setCliDireccion(String cliDireccion) {
		this.cliDireccion = cliDireccion;
	}

	public String getCliPostal() {
		return cliPostal;
	}

	public void setCliPostal(String cliPostal) {
		this.cliPostal = cliPostal;
	}

	public Date getCliFecha() {
		return cliFecha;
	}

	public void setCliFecha(Date cliFecha) {
		this.cliFecha = cliFecha;
	}

	public String getCliEstado() {
		return cliEstado;
	}

	public void setCliEstado(String cliEstado) {
		this.cliEstado = cliEstado;
	}

}
