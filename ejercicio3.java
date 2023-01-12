/*
 * Ejercicio 3
 * 
 * Realiza un programa que genere una excepción de forma aleatoria de entre las siguientes excepciones: 
 * NumberFormatException, IOException, FileNotFoundException, IndexOutOfBoundsException y ArithmeticException.
 * 
 * @author Antonio Luis Garcia
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ejercicio3 {
  	public static void main(String[] args) {

		ArrayList<Exception> excepciones = new ArrayList<Exception>();
		
		excepciones.add(new NumberFormatException());
		excepciones.add(new IOException());
		excepciones.add(new FileNotFoundException());
		excepciones.add(new IndexOutOfBoundsException());
		excepciones.add(new ArithmeticException());
		
		try {

			throw excepciones.get((int)(Math.random() * 6));
		} catch (Exception e) {

			e.printStackTrace();
		}
    }	
  
}