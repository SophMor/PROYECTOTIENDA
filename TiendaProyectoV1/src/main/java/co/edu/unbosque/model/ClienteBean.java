package co.edu.unbosque.model;
import java.util.List;

import javax.faces.bean.ManagedBean;

import co.edu.unbosque.dao.ClienteDAO;
import co.edu.unbosque.dto.ClienteDTO;

@ManagedBean
public class ClienteBean  {

	private String cedula;
	private String nombrecompleto;
	private String direccion;
	private String telefono;
	private String coreoelectronnico;
	private String resultado;
	private List<ClienteDTO> listaClientes;
	private ClienteDAO cliente;

	// Getter y Setter para todas las propiedades


	public String agregar() {
		cliente = new ClienteDAO();
		this.resultado = cliente.agregar(new ClienteDTO(this.cedula, this.nombrecompleto, this.direccion,
				this.telefono, this.coreoelectronnico));
		this.listaClientes = (List<ClienteDTO>) cliente.consultar();

		if (this.resultado.equals("OK") && this.listaClientes != null) {
			return "tablaClientes.xhtml";
		} else {
			return "error.xhtml";
		}
	}


	public Object consultar() {
		cliente = new ClienteDAO();
		this.listaClientes = (List<ClienteDTO>) cliente.consultar();

		if (this.listaClientes != null) {
			return "tablaclientes.xhtml";
		} else {
			return "error.xhtml";
		}
	}

	public String borrar() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object listar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String actualizar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombrecompleto() {
		return nombrecompleto;
	}

	public void setNombrecompleto(String nombrecompleto) {
		this.nombrecompleto = nombrecompleto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCoreoelectronnico() {
		return coreoelectronnico;
	}

	public void setCoreoelectronnico(String coreoelectronnico) {
		this.coreoelectronnico = coreoelectronnico;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public List<ClienteDTO> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<ClienteDTO> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ClienteDAO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDAO cliente) {
		this.cliente = cliente;
	}

	// Resto de los métodos




}
