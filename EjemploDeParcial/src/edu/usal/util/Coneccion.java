package edu.usal.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccion {
	private Connection coneccion;
	
	public Coneccion() {
		coneccion=null;
	}
	
	public boolean iniciarConeccion() throws SQLException, IOException {
		try {
			Class.forName(PropertiesUtil.getDriver());
			this.coneccion = DriverManager.getConnection(PropertiesUtil.getUrl()+"databaseName="+PropertiesUtil.getDatabaseName(), PropertiesUtil.getUserName(), PropertiesUtil.getPassword());	
			return true;
		} catch (ClassNotFoundException e) {
			IOGeneral.pritln("Error al cargar driver SQL.");
			return false;
		}		
	}
	
	public boolean cerrarConeccion()  throws SQLException {
		if(!this.coneccion.isClosed()) {
			this.coneccion.close();
			return true;
		}else {
			IOGeneral.pritln("No hay coneccion activa, verificar codigo");
			return false;
		}
	}

	public Connection getConeccion() {
		return coneccion;
	}

	public void setConeccion(Connection con) {
		this.coneccion = con;
	}
	
	
	
}
