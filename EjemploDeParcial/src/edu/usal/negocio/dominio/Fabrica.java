package edu.usal.negocio.dominio;

public class Fabrica {

	private int id;
	private String nombre;
	private int tel;
	
	public Fabrica(int i, String n, int t) {
		this.id=i;
		this.nombre=n;
		this.tel=t;
	}
	
	public Fabrica() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "ID="+id + " -Nombre="+nombre + " -Telefono=" + tel ;
	}	
	
}
