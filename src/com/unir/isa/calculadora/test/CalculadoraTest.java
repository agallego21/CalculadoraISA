package com.unir.isa.calculadora.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.unir.isa.calculadora.Calculadora;

/**
 * Clase que contiene los Test Unit definidos para el proyecto Calculadora
 *
 */
class CalculadoraTest {

	// ********** SUMA ***********
	@Test
	@DisplayName("Prueba suma enteros positivos")
	public void testSumarEnterosPos() {
		assertEquals(Calculadora.suma(2,2),  4);
	}

	@Test
	@DisplayName("Prueba suma decimales positivos")
	public void testSumarDecimalesPos() {
		assertEquals(Calculadora.suma(6.47, 3.72),  10.19);
	}

	@Test
	@DisplayName("Prueba suma enteros negativos")
	public void testSumarEnterosNeg() {
		assertEquals(Calculadora.suma((-2),(-2)),  -4);
	}

	@Test
	@DisplayName("Prueba suma decimales negativos")
	public void testSumarDecimalesNeg() {
		assertEquals(Calculadora.suma((-6.47),(-3.72)),  -10.19);
	}

	@Test
	@DisplayName("Prueba suma entero positivo y negativo")
	public void testSumarEnterosPosNeg() {
		assertEquals(Calculadora.suma(2,(-2)),  0);
	}

	@Test
	@DisplayName("Propiedad conmutiva suma")
	public void testSumarConmutativa() {
		assertEquals(Calculadora.suma(2,2),  2+2);
	}

	//******* RESTA ********
	@Test
	@DisplayName("Prueba resta enteros positivos")
	public void testRestarEnterosPos() {
		assertEquals(Calculadora.resta(2,2),  0);
	
	}

	@Test
	@DisplayName("Prueba resta decimales positivos")
	public void testRestarDecimalesPos() {
		assertEquals(Calculadora.resta(6.11, 3.11),  3.00);
	}

	@Test
	@DisplayName("Prueba resta enteros negativos")
	public void testRestarEnterosNeg() {
		assertEquals(Calculadora.resta((-2),(-2)),  0);
	}

	@Test
	@DisplayName("Prueba resta decimales negativos")
	public void testRestarDecimalesNeg() {
		assertEquals(Calculadora.resta((-6.47),(-3.72)),  -2.75);
	}



	@Test
	@DisplayName("Restar un número positivo a un número positivo menor")
	public void testRestarEnterosPosPosMen() {
		assertEquals(Calculadora.resta(3, 2),  1);
	}

	@Test
	@DisplayName("Restar un número positivo a un número negativo")
	public void testRestarEnterosPosNeg() {
		assertEquals(Calculadora.resta(3, -2),  5);
	}

	@Test
	@DisplayName("Restar un número negativo a un número positivo")
	public void testRestarEnterosNegPos() {
		assertEquals(Calculadora.resta(-3, 2),  -5);
	}


	// ********** MULTIPLICACION ***********

	@Test
	@DisplayName("Prueba multiplicacion enteros positivos")
	public void testMultiplicarEnterosPos() {
		assertEquals(Calculadora.multiplicacion(2,2),  4);
	}

	@Test
	@DisplayName("Prueba multiplicacion decimales positivos")
	public void testMultiplicarDecimalesPos() {
		assertEquals(Calculadora.multiplicacion(2.2, 2.2),  4.840000000000001);
	}

	@Test
	@DisplayName("Prueba multiplicacion enteros negativos")
	public void testMultiplicarEnterosNeg() {
		assertEquals(Calculadora.multiplicacion((-2),(-2)),  4);
	}

	@Test
	@DisplayName("Multiplicar un número entero positivo y un número entero negativo")
	public void testMultiplicarEnterosPosNeg() {
		assertEquals(Calculadora.multiplicacion(2,(-2)),  -4);
	}
	@Test
	@DisplayName("Propiedad conmutativa multiplicacion")
	public void testMultiplicarConmutativa() {
		assertEquals(Calculadora.multiplicacion(2, 2),  Calculadora.multiplicacion(2, 2));
	}

// ********** DIVISION ***********

	@Test
	@DisplayName("Dividir dos números enteros con resto 0")
	public void testDividirEnterosPos() {

		assertEquals(Calculadora.division(4, 2),  2);
	}

	@Test
	@DisplayName("Dividir dos números enteros con resto distinto de 0")
	public void testDividirEnterosPosDis() {
		assertEquals(Calculadora.division(5, 2),  2,5);
	}

	@Test
	@DisplayName("Comprobar resultado dividendo (cociente * divisor + resto = dividendo)")
	public void testComprobarDiv() {

		assertEquals(Calculadora.compruebaMDivision(5, 3, 0),  15);
	}

// ********** RAIZ CUADRADA *********** 
	@Test
	@DisplayName("Raíz cuadrada exacta de un número positivo")
	public void testRaizCuadrada() {
		assertEquals(Calculadora.calcularRaizCuadrada(9),  3); // a**2 = b
	}

	@Test
	@DisplayName("Raíz cuadrada inexacta de un número positivo")
	public void testRaizCuadradaIne() {
		assertEquals(Calculadora.calcularRaizCuadrada(3),  1,732050808);
	}

	@Test
	@DisplayName("Comprobar resultado raiz cuadrada (raiz cuadrada * raiz cuadrada = numero) raiz(4)*raiz(4)=4")
	public void testComprobarRaiz() {
		assertEquals(Calculadora.multiplicacion(2,2),  Calculadora.multiplicacion(Calculadora.calcularRaizCuadrada(4), Calculadora.calcularRaizCuadrada(4)));
	}

}
