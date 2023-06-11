package com.unir.isa.calculadora.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Clase que contiene los Test Unit definidos para el proyecto Calculadora
 *
 */
class CalculadoraTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	// ********** SUMA ***********
	@Test
	@DisplayName("Prueba suma enteros positivos")
	public void testSumarEnterosPos() {
		assertEquals(2+2,  4);
	}

	@Test
	@DisplayName("Prueba suma decimales positivos")
	public void testSumarDecimalesPos() {
		assertEquals(6.47+3.72,  10.19);
	}

	@Test
	@DisplayName("Prueba suma enteros negativos")
	public void testSumarEnterosNeg() {
		assertEquals((-2)+(-2),  -4);
	}

	@Test
	@DisplayName("Prueba suma decimales negativos")
	public void testSumarDecimalesNeg() {
		assertEquals((-6.47)+(-3.72),  -10.19);
	}

	@Test
	@DisplayName("Prueba suma entero positivo y negativo")
	public void testSumarEnterosPosNeg() {
		assertEquals(2+(-2),  0);
	}

	@Test
	@DisplayName("Propiedad conmutiva suma")
	public void testSumarConmutativa() {
		assertEquals(2+2,  2+2);
	}

	//******* RESTA ********
	@Test
	@DisplayName("Prueba resta enteros positivos")
	public void testRestarEnterosPos() {
		assertEquals(2-2,  0);
	}

	@Test
	@DisplayName("Prueba resta decimales positivos")
	public void testRestarDecimalesPos() {
		assertEquals(6.47-3.72,  2.75);
	}

	@Test
	@DisplayName("Prueba resta enteros negativos")
	public void testRestarEnterosNeg() {
		assertEquals((-2)-(-2),  0);
	}

	@Test
	@DisplayName("Prueba resta decimales negativos")
	public void testRestarDecimalesNeg() {
		assertEquals((-6.47)-(-3.72),  -2.75);
	}

	@Test
	@DisplayName("Restar un número positivo a un número positivo menor")
	public void testRestarEnterosPosPosMen() {
		assertEquals(3-2,  1);
	}

	@Test
	@DisplayName("Restar un número positivo a un número negativo")
	public void testRestarEnterosPosNeg() {
		assertEquals(3-(-2),  5);
	}

	@Test
	@DisplayName("Restar un número negativo a un número positivo")
	public void testRestarEnterosNegPos() {
		assertEquals((-3)-2,  -5);
	}


	// ********** MULTIPLICACION ***********

	@Test
	@DisplayName("Prueba multiplicacion enteros positivos")
	public void testMultiplicarEnterosPos() {
		assertEquals(2*2,  4);
	}

	@Test
	@DisplayName("Prueba multiplicacion decimales positivos")
	public void testMultiplicarDecimalesPos() {
		assertEquals(6.47*3.72,  24.0764);
	}

	@Test
	@DisplayName("Prueba multiplicacion enteros negativos")
	public void testMultiplicarEnterosNeg() {
		assertEquals((-2)*(-2),  4);
	}

	@Test
	@DisplayName("Multiplicar un número entero positivo y un número entero negativo")
	public void testMultiplicarEnterosPosNeg() {
		assertEquals(2*(-2),  -4);
	}
	@Test
	@DisplayName("Propiedad conmutativa multiplicacion")
	public void testMultiplicarConmutativa() {
		assertEquals(2*2,  2*2);
	}

	// ********** DIVISION ***********

	@Test
	@DisplayName("Dividir dos números enteros con resto 0")
	public void testDividirEnterosPos() {
		assertEquals(4/2,  2);
	}

	@Test
	@DisplayName("Dividir dos números enteros con resto distinto de 0")
	public void testDividirEnterosPosDis() {
		assertEquals(5/2,  2.5);
	}

	@Test
	@DisplayName("Comprobar resultado dividendo (cociente * divisor + resto = dividendo)")
	public void testComprobarDiv() {
		assertEquals(5*3+0,  15);
	}

	// ********** RAIZ CUADRADA ***********
	@Test
	@DisplayName("Raíz cuadrada exacta de un número positivo")
	public void testRaizCuadrada() {
		assertEquals(2,  4); // a**2 = b
	}

	@Test
	@DisplayName("Raíz cuadrada inexacta de un número positivo")
	public void testRaizCuadradaIne() {
		assertEquals(3,  1,732050808);
	}

	@Test
	@DisplayName("Comprobar resultado raiz cuadrada (raiz cuadrada * raiz cuadrada = numero) raiz(4)*raiz(4)=4")
	public void testComprobarRaiz() {
		assertEquals(2*2,  4);
	}

}
