package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Conexion.ControlConexion;

import java.awt.*;

public class TablaPacientes extends JTable {

	private final String SENT = "SELECT identificador, nombre, apellido, dni, direccion, telefono FROM persona WHERE ocupacion = 'paciente';";
	private final String[] TITULOS = {"Identificador", "Nombre", "Apellido", "DNI", "Direccion", "Telefono"};
	
	private ControlConexion con = new ControlConexion();
	
	DefaultTableModel datos = con.ejecutarSentencia(SENT, TITULOS);
	
	public TablaPacientes() {
		super();
		
		setAutoCreateRowSorter(true);
        setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        setModel(datos);
        
	}

}