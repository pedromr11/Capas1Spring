package com.pedro.demo.consultaDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Datos implements IDatos{
	
	@Override
	public List<String> consultaCoches(String nombre) throws IOException {
		
		
		File file = new File("C:\\Users\\201908\\Desktop\\Coches.txt");
		BufferedReader lector;
		
		
		List<String> listaNombres = new ArrayList();
		
		
		lector = new BufferedReader(new FileReader(file));
		String linea;
		
		while((linea = lector.readLine()) != null) {
			
			String[] arrayCoche = linea.split("-");
			listaNombres.add(arrayCoche[0]);
		}
		
		
		
		return listaNombres;		
	}
	
	
	
	
	
}
