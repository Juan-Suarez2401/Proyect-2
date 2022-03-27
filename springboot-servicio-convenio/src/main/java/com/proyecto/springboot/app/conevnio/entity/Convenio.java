package com.proyecto.springboot.app.conevnio.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "convenio")

public class Convenio {

	@Id
	private Long identificacion;
	
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    @Temporal(TemporalType.DATE)
    private Date periodo;
    
    private String programa;
    private Double valor_pagar;
    private Integer pin;
    private String nombre_convenio;
    
    
    
    public Convenio() {
    	
    }
    
    
	public Long getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public Date getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Date periodo) {
		this.periodo = periodo;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public Double getValor_pagar() {
		return valor_pagar;
	}
	public void setValor_pagar(Double valor_pagar) {
		this.valor_pagar = valor_pagar;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public String getNombre_convenio() {
		return nombre_convenio;
	}
	public void setNombre_convenio(String nombre_convenio) {
		this.nombre_convenio = nombre_convenio;
	}
    
    
     

}
