package edu.usal.negocio.dao.implementacion.SQL;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.util.Coneccion;

public class ClienteDAOImplSQL implements ClienteDAO{

	Coneccion con;
	Statement stm;
	PreparedStatement prep;
	String query;
	
	
	@Override
	public boolean addCliente(Cliente cliente)  throws SQLException {
	
		con = new Coneccion();
		try {
			if(con.iniciarConeccion()) {
				con.getConeccion().setAutoCommit(false);
				query = ("INSERT INTO Cliente VALUES (?,?,?,?,?,?);");
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1,cliente.getID());
				prep.setFloat(2, cliente.getSaldo());
				prep.setInt(3, cliente.getCredito());
				prep.setString(4, cliente.getDescuento());
				prep.setInt(5, cliente.getDni());
				prep.setString(6, cliente.getDireccion());
		
				prep.executeUpdate();
		
				prep.close();
					con.getConeccion().commit();
						con.cerrarConeccion();
						return true;
				
}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		con.getConeccion().rollback();
		prep.close();
		con.cerrarConeccion();
		return false;
	
	}
	

	@Override
	public boolean updateCliente(Cliente cliente) throws SQLException {
		con = new Coneccion();
		try {
			if(con.iniciarConeccion()) {
				query = "UPDATE Cliente SET ID=?,Saldo=?,Credito=?,Descuento=?,Dni=?,Direccion=? WHERE DNI=?";
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1,cliente.getID());
				prep.setFloat(2, cliente.getSaldo());
				prep.setInt(3, cliente.getCredito());
				prep.setString(4, cliente.getDescuento());
				prep.setInt(5, cliente.getDni());
				prep.setString(6, cliente.getDireccion());
				prep.setInt(7, cliente.getDni());
				prep.executeUpdate();
		
					prep.close();
					con.cerrarConeccion();
					return true;
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		prep.close();
		con.cerrarConeccion();
		return false;
	}

	@Override
	public boolean deleteCliente(Cliente cliente) throws SQLException {
		con = new Coneccion();
		try {
			if(con.iniciarConeccion()) {
				query = "DELETE FROM Cliente  where DNI=?";
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1,cliente.getDni());
				prep.executeUpdate();
				
					prep.close();
					con.cerrarConeccion();
					return true;
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		prep.close();
		con.cerrarConeccion();
		return false;
	}

	@Override
	public List<Cliente> getAllCliente() throws SQLException {
		List <Cliente> lista = new ArrayList<Cliente>();
		con = new Coneccion();
		try {
			if(con.iniciarConeccion()) {
				query = "SELECT * FROM Cliente";
				prep = con.getConeccion().prepareStatement(query);
				ResultSet rs = prep.executeQuery();
				while(rs.next()) {
					lista.add(new Cliente(rs.getInt(1), rs.getFloat(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getString(6)));
					}
				prep.close();
				con.cerrarConeccion();
				return lista;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		prep.close();
		con.cerrarConeccion();
		return null;
	}

	@Override
	public Cliente readCliente(int dni) throws SQLException {
		con = new Coneccion();
		try {
			if(con.iniciarConeccion()) {
				query = "SELECT * FROM Cliente WHERE DNI=?";
				prep = con.getConeccion().prepareStatement(query);
				prep.setInt(1, dni);
				ResultSet rs = prep.executeQuery();
				rs.next();
				Cliente nuevo = new Cliente(rs.getInt(1), rs.getFloat(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getString(6));
				prep.close();
				con.cerrarConeccion();
				return nuevo;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		prep.close();
		con.cerrarConeccion();
		return null;
	}

}
