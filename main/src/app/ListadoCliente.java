package app;

import java.util.ArrayList;

public class ListadoCliente
{
	ArrayList<Cliente>listadoCliente;
	 
	//CONSTRUCTOR COMPLETO
	public ListadoCliente()
	{
		listadoCliente = new ArrayList<Cliente>();	
	}
		 
	//METODOS 
	/*
	 * agrega
	 * @param recibe un nuevo cliente
	 */
	public boolean agregarCliente(Cliente nuevoCliente)
	{
		return listadoCliente.add(nuevoCliente);
	}
	
	/* 
	 * retornaElListado
	 */
	
	public ArrayList<Cliente> getListadoClientes()
	{
		return listadoCliente;
	}
	
	/*
	 * retornaElTama�oDelListado
	 */
	public int getTamañoLista()
	{
		return listadoCliente.size();
	}
	
	/*
	 * retornaSiEstaVacia
	 */
	
	public boolean estaVacia()
	{
		if (getTamañoLista() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*
	 * eliminarDelListadoDeAviones
	 */
	
	public boolean eliminarCliente(Cliente cliente)
	{
		if(!estaVacia())
		{
			return listadoCliente.remove(cliente);
		}
		else
		{
			return false;
		}
	}
	
	/*
	 * mostrarListado
	 */
	
	public String listarClientes()
	{
		StringBuilder buildi = new StringBuilder();
		
		for (Cliente cli : listadoCliente)
		{
			buildi.append(cli.toString()+"\n");
		}
	
		return buildi.toString();
	}	
}
