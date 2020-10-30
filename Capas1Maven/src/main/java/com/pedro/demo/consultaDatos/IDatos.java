package com.pedro.demo.consultaDatos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IDatos {
	
	List<String> consultaCoches(String nombre) throws IOException;
}
