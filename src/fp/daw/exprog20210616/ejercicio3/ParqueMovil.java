package fp.daw.exprog20210616.ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ParqueMovil {

	File ruta = new File("");
	Integer anyo;
	String provincia;
	Enum tipo_vehiculo;
	/*
	 * creo un mapa donde la clave sea la provincia y los valores el numero de cada
	 * tipo de vehiculos dentro de una lista ordenada por el orden de insercion,
	 * para que mediante el acceso a una determinada posicion sepamos de que tipo de
	 * vehiculo se trata
	 */

	public ParqueMovil(File ruta, Integer anyo) {
		this.ruta = ruta;
		this.anyo = anyo;
		Map<String, LinkedList<String>> datos = new TreeMap<>();

	}

	public int vehiculosTipoyProvincia(String provincia, Enum tipo_vehiculo) {
		int numVehiculos = 0;
		//leemos celdas desde java
	    try {
			FileInputStream in=new FileInputStream(ruta);
			//.....
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	    
		
		
		return numVehiculos;
		
		

	}
	
	public int vehiculosProvincia(String provincia) {
		int numVehiculos = 0;
		
		
		return numVehiculos;
		
		

	}
	
	public int vehiculosPorTipo(Enum tipo_vehiculo) {
		int numVehiculos = 0;
		
		
		return numVehiculos;
		
		

	}
	
	public int totalVehiculos(){
		int numVehiculos = 0;
		
		
		return numVehiculos;
		
	}
	
	public void vehiculosBinario(File ruta) {
		
	}

	public Integer getAnyo() {
		return anyo;
	}
	

	
	

	
}
