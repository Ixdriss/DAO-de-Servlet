package edu.usal.negocio.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Pedido implements Serializable{


	private static final long serialVersionUID = 1L;
	private int id;
	private String dir;
	private Calendar date;
	private List<String> lista;
	
	
	public Pedido(int i, String d, Calendar da, List l) {
		this.id=i;
		this.dir=d;
		this.date=da;
		this.lista=l;
	}
	
	public Pedido() {
		Calendar date = new GregorianCalendar();
		List<String> lista = new ArrayList<String>();
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
/*
	@Override
	public String toString() {
		return "ID="+ id + " -Direccion" + dir + " -Fecha=" + date 
				+ " -Articulos=" +lista.listToString();
	}	
	
	public String listToString(ArrayList l) {
		int i;
		String str;
		for(String st: l) {
			str+="\n" +st.toString();
			
		}
		return str;
		
	}
	
	*/
}
