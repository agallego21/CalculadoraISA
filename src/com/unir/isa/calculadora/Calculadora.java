package com.unir.isa.calculadora;

import java.io.IOException;
import java.util.Scanner;

/** 
 * Clase que implementa una calculadora
 */
public class Calculadora {
	
	static Scanner scanner = new Scanner(System.in); //Para recoger texto por consola
	static int select = -1;

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		
		//Continua la ejecución mientras el usuario no pulse 0
		while(select != 0) {
			//Try catch para evitar que el programa termine si hay un error
			try {
				showMenu();
				
				//Recoger una variable por consola
				select = Integer.parseInt(scanner.nextLine()); 
				
				//Ejemplo de switch case en Java
				switch(select){
				case 1: 
					System.out.println("\n    == SUMA == ");
					double a=insertNumber(1);
					double b=insertNumber(2);
					
					showResult(suma(a, b));
					
					break;
				case 2: 
					System.out.println("\n == RESTA == ");
					pressToContinue();
					break;
				case 3: 
					System.out.println("\n == MULTIPLICACIÓN == ");
					pressToContinue();
					break;
				case 4: 
					System.out.println("\n == DIVISIÓN == ");
					pressToContinue();
					break;
				case 5: 
					System.out.println("\n == RAÍZ CUADRADA == ");
					pressToContinue();
					break;
				case 0: 
					System.out.println("===========================");
					break;
				default:
					System.out.println("\n    Operación no válida!!");
					pressToContinue();
					break;
				}
				
			} catch(Exception e) { 
				System.out.println("  Se ha producido un error, por favor, pulse una tecla para continuar...");
			}
		}

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

	// Comprobar multiplicacion cociente * divisor + resto = dividendo
	public static Double compruebaMDivision(double i, double j, double k) {

		return (i * j) + k;
	}

	public static Integer division(int i, int j) {

		return i / j;
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
    
	/**
	 * Solicita un número por pantalla
	 */
	private static void pressToContinue(){
		System.out.print("\n    Pulse <Enter> para continuar...");
		scanner.nextLine();
	}
	
	/**
	 * Para la ejecución hasta que se pulse una tecla
	 */
	private static Double insertNumber(int order){
		System.out.print("    Introduzca número "+order+":  ");
		return Double.parseDouble(scanner.nextLine());
	}

	/**
	 * Muestra el resultado por pantalla
	 */
	private static void showResult(double result){
		System.out.println("             ------------------------");
		System.out.println("             Resultado :  "+result);
		pressToContinue();
	}
}
