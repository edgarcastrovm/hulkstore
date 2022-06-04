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
@Table(name = "hs_tipo_producto")
public class HsTipoProducto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tip_id")
	private Long tipId;

	@Column(name = "tip_nombre")
	private String tipNombre;

	@Column(name = "tip_sigla")
	private String tipSigla;

	@Column(name = "tip_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date tipFecha;

	@Column(name = "tip_estado")
	private String tipEstado;

	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "hsProducto", referencedColumnName = "tipId")
	private List<HsProducto> hsProducto = new ArrayList<HsProducto>();*/

	@PrePersist
	public void prePersist() {
		this.tipFecha = new Date();
		this.tipEstado = "ACTIVO";
	}

	public Long getTipId() {
		return tipId;
	}

	public void setTipId(Long tip_id) {
		this.tipId = tip_id;
	}

	public String getTipNombre() {
		return tipNombre;
	}

	public void setTipNombre(String tipNombre) {
		this.tipNombre = tipNombre;
	}

	public String getTipSigla() {
		return tipSigla;
	}

	public void setTipSigla(String tipSigla) {
		this.tipSigla = tipSigla;
	}

	public Date getTipFecha() {
		return tipFecha;
	}

	public void setTipFecha(Date tipFecha) {
		this.tipFecha = tipFecha;
	}

	public String getTipEstado() {
		return tipEstado;
	}

	public void setTipEstado(String tipEstado) {
		this.tipEstado = tipEstado;
	}

	/*public List<HsProducto> getHsProducto() {
		return hsProducto;
	}

	public void setHsProducto(List<HsProducto> hsProducto) {
		this.hsProducto = hsProducto;
	}*/

}
