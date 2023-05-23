package co.edu.unbosque.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import co.edu.unbosque.dto.ClienteDTO;

public class ClienteDAO implements CrudI{

	private List<ClienteDTO>listaClientes;
	private boolean actual;
	public ClienteDAO() {
		listaClientes = new ArrayList();
		actual  = false;
	}

	//verifica
	private void listarClientes(List<ClienteDTO> listaClientes) {
		System.out.println(" --- Listado Cliente");
		for (ClienteDTO cliente : listaClientes) {
			System.out.println(cliente);
		}
	}
	@Override
	public String agregar(Object registro) {

		String resultado;
		SessionFactory miFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(ClienteDTO.class)
				.buildSessionFactory();

		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			miSession.save((ClienteDTO) registro);
			miSession.getTransaction().commit();
			resultado = "OK";
			miSession.close();
		} catch (Exception e) {
			resultado = e.toString();
		} finally {
			miFactory.close();
		}
		return resultado;
	}
	@Override
	public Object consultar() {
		SessionFactory miFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(ClienteDTO.class)
				.buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction(); //aqui comienza lo hibernate 
			listaClientes = miSession.createQuery("from ClienteDTO").getResultList();
			listarClientes(listaClientes);
			miSession.getTransaction().commit();
			miSession.close();
		} catch (Exception e) {
			listaClientes = null;
		} finally {
			miFactory.close();
		}
		return listaClientes;
	}
	@Override
	public String borrar(Object id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object listar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String actualizar(Object nombre, ClienteDTO nuevoCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
