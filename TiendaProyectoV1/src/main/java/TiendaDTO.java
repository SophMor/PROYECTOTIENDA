
public class TiendaDTO {
	private String tipoComercio;
	private String NIT;
	private String ciudad;
	private int valorIva;
	private int tasaInteres;
	private String bancoCtaCorrte;
	private String numeroCuentaCte;
	private String nombreGerente;
	public TiendaDTO(String tipoComercio, String nIT, String ciudad, int valorIva, int tasaInteres,
			String bancoCtaCorrte, String numeroCuentaCte, String nombreGerente) {
		this.tipoComercio = tipoComercio;
		this.NIT = nIT;
		this.ciudad = ciudad;
		this.valorIva = valorIva;
		this.tasaInteres = tasaInteres;
		this.bancoCtaCorrte = bancoCtaCorrte;
		this.numeroCuentaCte = numeroCuentaCte;
		this.nombreGerente = nombreGerente;
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
	public int getValorIva() {
		return valorIva;
	}
	public void setValorIva(int valorIva) {
		this.valorIva = valorIva;
	}
	public int getTasaInteres() {
		return tasaInteres;
	}
	public void setTasaInteres(int tasaInteres) {
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
