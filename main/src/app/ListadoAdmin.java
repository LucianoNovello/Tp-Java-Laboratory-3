package app;
import java.io.Serializable;
import java.util.ArrayList;

public class ListadoAdmin implements Serializable
{
	ArrayList<Administrador>listadoAdmin;
		 
	//CONSTRUCTOR COMPLETO
	public ListadoAdmin()
	{
		listadoAdmin = new ArrayList<Administrador>();	
	}
		 
	//METODOS 
	/*
	 * agregaUnAdmin
	 * @param recibe un administrador
	 */
	public boolean agregarAdministrador(Administrador adm)
	{
		return listadoAdmin.add(adm);
	}
	
	/* 
	 * retornaElListado
	 */
	
	public void setListadoAdmin(ArrayList<Administrador> listadoAdmin) {
		this.listadoAdmin = listadoAdmin;
	}

	public ArrayList<Administrador> getListadoAdm()
	{
		return listadoAdmin;
	}
	
	/*
	 * retornaElTama�oDelListado
	 */
	public int getTamañoLista()
	{
		return listadoAdmin.size();
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
	
	public boolean eliminarAdm(Administrador adm)
	{
		if(!estaVacia())
		{
			return listadoAdmin.remove(adm);
		}
		else
		{
			return false;
		}
	}
	
	/*
	 * mostrarListado
	 */
	
	public String listarAdmins()
	{
		StringBuilder buildi = new StringBuilder();
		
		for (Administrador adm : listadoAdmin)
		{
			buildi.append(adm.toString()+"\n");
		}
	
		return buildi.toString();
	}
	/*
	 * me devuelve los nombres de las aerolineas en cada listado de adm
	*/
	

}