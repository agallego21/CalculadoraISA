package com.unir.isa.calculadora;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/** 
 * Clase que implementa una calculadora
 */
public class Calculadora {
	
	static Scanner scanner = new Scanner(System.in); //Para recoger texto por consola
	static int select = -1;

	/**
	 * Método ejecutor de la Calculadora
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		double a, b=0;
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
					a=insertNumber(1);
					b=insertNumber(2);
					
					showResult(suma(a, b));
					break;
				case 2: 
					System.out.println("\n    == RESTA == ");
					a=insertNumber(1);
					b=insertNumber(2);
					
					showResult(resta(a, b));
					break;
				case 3: 
					System.out.println("\n    == MULTIPLICACIÓN == ");
					a=insertNumber(1);
					b=insertNumber(2);
					
					showResult(multiplicacion(a, b));
					break;
				case 4: 
					System.out.println("\n    == DIVISIÓN == ");
					a=insertNumber(1);
					b=insertNumber(2);
					
					showResult(division(a, b));
					break;
				case 5: 
					System.out.println("\n    == RAÍZ CUADRADA == ");
					a=insertNumber(1);
					
					showResult(calcularRaizCuadrada(a));
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
				System.out.println("\n  ERROR: "+e.getMessage());
				pressToContinue();
			}
		}

	}

	// Métodos de la calculadora
    public static Double suma(double d, double e) {

        return d + e;
    }

	public static Double resta(double i, double j) {

		return BigDecimal.valueOf(i-j)
        	    .setScale(3, RoundingMode.HALF_UP)
        	    .doubleValue();
	}

	public static Double multiplicacion(double i, double j) {

		return i * j;
	}

	// Comprobar multiplicacion cociente * divisor + resto = dividendo
	public static Double compruebaMDivision(double i, double j, double k) {

		return (i * j) + k;
	}

	public static Double division(double i, double j) {

		return BigDecimal.valueOf(i/j)
        	    .setScale(3, RoundingMode.HALF_UP)
        	    .doubleValue();
	}

	// Método para calcular la diferencia absoluta
    private static double diferenciaAbsoluta(double a, double b) {
        return a > b ? resta(a, b) : resta(b, a);
    }

    // Método para calcular la raíz cuadrada utilizando el Método de Herón
    public static double calcularRaizCuadrada(double numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }

        // Estimación inicial
        double estimacion = division(numero, 2);
        double diferencia;
        do {
            // Mejora de la estimación
            double nuevaEstimacion = 
            		division(suma(estimacion,division(numero, estimacion)),2);
            diferencia = diferenciaAbsoluta(nuevaEstimacion, estimacion);
            estimacion = nuevaEstimacion;
            
        } while (diferencia > 1e-10); // 1e-3 es el umbral de precisión

        return BigDecimal.valueOf(estimacion)
        	    .setScale(3, RoundingMode.HALF_UP)
        	    .doubleValue();		//Redondeamos a tres decimales
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
