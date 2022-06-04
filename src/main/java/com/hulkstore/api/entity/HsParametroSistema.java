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
@Table(name = "hs_parametro_sistema")
public class HsParametroSistema implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pas_id")
	private Long pasId;
	
	@Column(name = "pas_key")
	private String pasKey;
	
	@Column(name = "pas_tipo")
	private String pasTipo;

	@Column(name = "pas_varchar")
	private String pasVarchar;
	
	@Column(name = "pas_int")
	private int pasInt;

	@Column(name = "pas_float")
	private Double pasFloat;

	@Column(name = "pas_date")
	private Date pasDate;
	
	@Column(name = "pas_desc")
	private Date pasDesc;

	@Column(name = "pas_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date pasFecha;

	@Column(name = "pas_estado")
	private String pasEstado;

	@PrePersist
	public void prePersist() {
		this.pasFecha = new Date();
		this.pasEstado = "ACTIVO";
	}

}
