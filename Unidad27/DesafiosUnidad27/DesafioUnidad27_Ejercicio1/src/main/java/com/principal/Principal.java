package com.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.entidades.Permiso;

public class Principal {
	public static void main(String[] args) {
		Permiso permiso = buscarPermisos("usuario_prueba@educacionit.com", "MODULO_03' AND 2!='");
		System.out.println(permiso);
	}

	private static Connection conectar() throws SQLException {
		Connection conexion = null;
		try {

			String driver = "org.mariadb.jdbc.Driver";
			String url = "jdbc:mariadb://localhost:3306/Desafio01JavaSE";
			String usuario = "root";
			String clave = "";
			Class.forName(driver);

			// CREAMOS LA CONEXION
			conexion = DriverManager.getConnection(url, usuario, clave);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conexion;
	}

	private static Permiso buscarPermisos(String usuario, String modulo) {
		Permiso permiso = null;

		try (Connection conexion = conectar()) {

			String sql = "SELECT usuario, modulo, activo FROM desafio01javase.permisos WHERE usuario = '" + usuario
					+ "' and modulo = '" + modulo + "'";

			Statement declaracionSQL = conexion.createStatement();

			ResultSet resultado = declaracionSQL.executeQuery(sql);

			System.out.println(sql);
			if (resultado.next()) {
				permiso = new Permiso(resultado.getString("usuario"), resultado.getString("modulo"),
						resultado.getInt("activo") == 1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return permiso;
	}

}
