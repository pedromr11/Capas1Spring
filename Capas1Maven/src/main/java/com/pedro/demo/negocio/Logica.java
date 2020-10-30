package com.pedro.demo.negocio;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pedro.demo.consultaDatos.Datos;
import com.pedro.demo.consultaDatos.IDatos;
@Component
public class Logica implements ILogica{
	
	@Autowired
	IDatos datos;
	@Override
	
	public Integer coches(String nombre) { 
		
		
		int numeroCoches = 0;
		
		

		ArrayList<String> listNom;
		try {
			listNom = new ArrayList <String> (datos.consultaCoches(nombre));
			
			
			for(int i = 0; i < listNom.size(); i++) {
				if(listNom.get(i).equals(nombre)) {
					numeroCoches++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return numeroCoches;
		
	}

}