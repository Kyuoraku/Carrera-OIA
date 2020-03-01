package tests;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.Test;

import tp1.Carrera;

class Testeos {

	@SuppressWarnings("resource")
	Boolean coinciden (String nombre) {
		
		BufferedReader br, br2;
		//lectura del output
		try {
			br = new BufferedReader(new FileReader("salida/".concat(nombre).concat(".out")));
			br2 = new BufferedReader(new FileReader("esperado/".concat(nombre).concat(".out")));
			while(br.readLine()!=null) {
				br2.readLine();
				if(!br.equals(br2)) return Boolean.FALSE;
			}
			return Boolean.TRUE;
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		return Boolean.FALSE;
	}
	
	@Test
	void test() throws FileNotFoundException {
		String nombre = "carrera";
		Carrera c = new Carrera("entrada/".concat(nombre).concat(".in"));
		assertTrue(this.coinciden(nombre));
		
	}

}
