package app;

import java.io.File;
import java.io.Serializable;

public class Cliente implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idCliente;
	private String nya; //nombreYApellido
	private String dni;
	private String usuario;
	private String contraseña;
	private String email;
	private Integer idBoleto;
	private boolean boletoObtenido;
	
	//CONSTRUCTOR COMPLETO
	public Cliente(String nya, String dni, String usuario, String contraseña, String email, Integer idBoleto, boolean boletoObtenido) 
	{
		super();
		generarIdCliente();
		this.nya = nya;
		this.dni = dni;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.email = email;
		this.idBoleto= idBoleto;
		this.boletoObtenido= boletoObtenido;
	}
	
	//CONSTRUCTOR VACIO
	public Cliente() 
	{
		super();
		generarIdCliente();
		nya = "";
		dni = "";
		usuario = "";
		contraseña = "";
		email = "";
		idBoleto= 0;
		boletoObtenido = false;
	}
	
	//GETTERS && SETTERS
	public Integer getIdCliente() 
	{
		return idCliente;
	}
	
	public String getNya() 
	{
		return nya;
	}

	public String getDNI() 
	{
		return dni;
	}
	public void setDNI(String dni)
	{
		this.dni = dni;
	}
	public String getUsuario() 
	{
		return usuario;
	}

	public void setUsuario(String usuario) 
	{
		this.usuario = usuario;
	}
	public String getContraseña() 
	{
		return contraseña;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setContraseña(String contraseña)
	{
		this.contraseña = contraseña;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public void setIdCliente(Integer idCliente)
	{
		this.idCliente = idCliente;
	}
	
	public void setNombreApellido(String nya)
	{
		this.nya = nya;
	}
	
	
	//METODOS
	
	public Integer getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(Integer idBoleto) {
		this.idBoleto = idBoleto;
	}

	public boolean isBoletoObtenido() {
		return boletoObtenido;
	}

	public void setBoletoObtenido(boolean boletoObtenido) {
		this.boletoObtenido = boletoObtenido;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + getIdCliente() + ", nya=" + getNya() + ", dni=" + getDNI() + ", usuario=" + getUsuario()
				+ ", contrase�a=" + getContraseña() + ", email=" + getEmail() + "]";
	}
	
	public void generarIdCliente()
	{
		int nRandom;
		
		nRandom=((int)(Math.random()*100+1));
		
		setIdCliente(nRandom);	
	}


	//TODO
	public void obtenerBoleto(){
		
	}
	
			
		
		
		
		
	}

