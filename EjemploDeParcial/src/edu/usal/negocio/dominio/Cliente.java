package edu.usal.negocio.dominio;

import java.io.Serializable;

public class Cliente implements Serializable{


	private static final long serialVersionUID = 1L;
	private int ID;
	private float saldo;
	private int credito;
	private String descuento;
	private int dni;
	private String direccion;
	
	public Cliente(int id, float s, int c, String d, int dn, String dir) {
		this.ID=id;
		this.saldo=s;
		this.credito=c;
		this.descuento=d;
		this.dni=dn;
		this.direccion=dir;
	}
	
	public Cliente() {
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ID="+ ID + " -Saldo=" + saldo + " -Credito=" + credito + " -Descuento=" + descuento
				+ " -DNI=" + dni + " -Direccion=" + direccion;
	}	
	
	
}
