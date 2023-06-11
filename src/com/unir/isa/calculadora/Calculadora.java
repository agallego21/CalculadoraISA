package com.unir.isa.calculadora;

import java.io.IOException;

/** 
 * Clase que implementa una calculadora
 */
public class Calculadora {

	public static void main(String[] args) throws Exception{
		showMenu();

	}

	// Métodos de la calculadora
    public static Double suma(double d, double e) {

        return d + e;
    }

	public static Double resta(double i, double j) {

		return i - j;
	}

	public static Double multiplicacion(double i, double j) {

		return i * j;
	}

    /**
     * Muestra el menú de la calculadora, borrando el contenido de la pantalla
     */
    private static void showMenu() throws InterruptedException, IOException{
    	//Limpiar pantalla
    	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    	System.out.println("==========================="+
    			"\n    *** CALCULADORA ***"+
    			"\n==========================="+
    			"\nOperaciones disponibles:" + 
    			"\n  1) Suma" + 
    			"\n  2) Resta" + 
    			"\n  3) Multiplicación" + 
    			"\n  4) División" + 
    			"\n  5) Raíz cuadrada" + 
    			"\n\n  0) Salir");
    	System.out.print("\n\n  Por favor, seleccione la operación deseada:  ");
    }
}
