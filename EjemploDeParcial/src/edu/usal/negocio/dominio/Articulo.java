package edu.usal.negocio.dominio;

import java.io.Serializable;

public class Articulo implements Serializable {


	private static final long serialVersionUID = 1L;
	private int ID;
	private String nombre;
	private String descripcion;
	private int stock;
	private Fabrica fabrica;
	
	public Articulo(int i, String n, String d, int s, Fabrica f) {
		this.ID=i;
		this.nombre=n;
		this.descripcion=d;
		this.stock=s;
		this.fabrica=f;
		
	}

	public Articulo() {
		Fabrica facbrica = new Fabrica();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Fabrica getFabrica() {
		return fabrica;
	}

	public void setFabrica(Fabrica fabrica) {
		this.fabrica = fabrica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return  "ID="+ID +" -Nombre="+nombre + " -Descripcion=" + descripcion + " -Stock=" + stock + " -Fabrica= "+fabrica.toString();
	}	
	

}
