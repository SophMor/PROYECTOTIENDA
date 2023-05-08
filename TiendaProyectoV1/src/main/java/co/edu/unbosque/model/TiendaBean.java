package co.edu.unbosque.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TiendaBean {
	private String tipoComercio;
	private String NIT;
	private String ciudad;
	private float valorIva;
	private float tasaInteres;
	private String bancoCtaCorrte;
	private String numeroCuentaCte;
	private String nombreGerente;

	public TiendaBean() {
		// TODO Auto-generated constructor stub
	}



	public String getTipoComercio() {
		return tipoComercio;
	}
	public void setTipoComercio(String tipoComercio) {
		this.tipoComercio = tipoComercio;
	}
	public String getNIT() {
		return NIT;
	}
	public void setNIT(String nIT) {
		NIT = nIT;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public float getValorIva() {
		return valorIva;
	}



	public void setValorIva(float valorIva) {
		this.valorIva = valorIva;
	}



	public float getTasaInteres() {
		return tasaInteres;
	}



	public void setTasaInteres(float tasaInteres) {
		this.tasaInteres = tasaInteres;
	}



	public String getBancoCtaCorrte() {
		return bancoCtaCorrte;
	}
	public void setBancoCtaCorrte(String bancoCtaCorrte) {
		this.bancoCtaCorrte = bancoCtaCorrte;
	}
	public String getNumeroCuentaCte() {
		return numeroCuentaCte;
	}
	public void setNumeroCuentaCte(String numeroCuentaCte) {
		this.numeroCuentaCte = numeroCuentaCte;
	}
	public String getNombreGerente() {
		return nombreGerente;
	}
	public void setNombreGerente(String nombreGerente) {
		this.nombreGerente = nombreGerente;
	}
}
