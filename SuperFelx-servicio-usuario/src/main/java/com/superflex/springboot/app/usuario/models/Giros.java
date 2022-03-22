package com.superflex.springboot.app.usuario.models;

import javax.persistence.*;

@Entity
@Table(name = "giros")
public class Giros {

	
	@Id
	private Long cedulaBeneficiaro;
	
	private String TipoIR;
	private String TipoIB;
	private String NombreRemitente;
	private Long CedulaRemitente;
	private String nombreBeneficiaro;
	private Boolean estapdoPago;
	private Integer valorGiro;
	private String departamento;
	private String municipio;
	
	
	public Long getCedulaBeneficiaro() {
		return cedulaBeneficiaro;
	}
	public void setCedulaBeneficiaro(Long cedulaBeneficiaro) {
		this.cedulaBeneficiaro = cedulaBeneficiaro;
	}
	public String getTipoIR() {
		return TipoIR;
	}
	public void setTipoIR(String tipoIR) {
		TipoIR = tipoIR;
	}
	public String getTipoIB() {
		return TipoIB;
	}
	public void setTipoIB(String tipoIB) {
		TipoIB = tipoIB;
	}
	public String getNombreRemitente() {
		return NombreRemitente;
	}
	public void setNombreRemitente(String nombreRemitente) {
		NombreRemitente = nombreRemitente;
	}
	public Long getCedulaRemitente() {
		return CedulaRemitente;
	}
	public void setCedulaRemitente(Long cedulaRemitente) {
		CedulaRemitente = cedulaRemitente;
	}
	public String getNombreBeneficiaro() {
		return nombreBeneficiaro;
	}
	public void setNombreBeneficiaro(String nombreBeneficiaro) {
		this.nombreBeneficiaro = nombreBeneficiaro;
	}
	public Boolean getEstapdoPago() {
		return estapdoPago;
	}
	public void setEstapdoPago(Boolean estapdoPago) {
		this.estapdoPago = estapdoPago;
	}
	public Integer getValorGiro() {
		return valorGiro;
	}
	public void setValorGiro(Integer valorGiro) {
		this.valorGiro = valorGiro;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	

	
	
	
	

}
