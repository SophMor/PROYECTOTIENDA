package co.edu.unbosque.model;

import co.edu.unbosque.dto.ClienteDTO;

public interface CrudBeanIn {

	public abstract String agregar();
	public abstract Object consultar();
	//public abstract String actualizar(Object id, Object registro);
	public abstract String borrar();
	public abstract Object listar();
	public abstract String actualizar();
}
