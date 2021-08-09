package JUnit.Geometria.test;

import static org.junit.jupiter.api.Assertions.*;
import JUnit.Junit09_Geometria.dto.Geometria;

import org.junit.jupiter.api.Test;

class GeometriaTest {

	@Test
	public void testAreaCuadrado() {
		Geometria geo = new Geometria();
		int resultado = geo.areacuadrado(5);// valor que va a calcular
		int esperado = 25;// valor que tiene que devolver
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}
	
	@Test
	public void testAreaCirculo() {
		Geometria geo = new Geometria();
		double resultado = geo.areaCirculo(5);
		double esperado = 3.1416 * Math.pow(5,2);
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}
	
	@Test
	public void testAreaTriangulo() {//en este ejercicio no pasa el test
		Geometria geo = new Geometria();
		int resultado = geo.areatriangulo(5, 5);
		double esperado = 12.5;
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}
	
	@Test
	public void testAreaRectangulo() {
		Geometria geo = new Geometria();
		int resultado = geo.arearectangulo(1, 1);
		double esperado = 1;
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}
	
	@Test
	public void testAreaPentagono() {
		Geometria geo = new Geometria();
		int resultado = geo.areapentagono(5, 5);
		double esperado = 12.5;
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}
	
	@Test
	public void testAreaRombo() {
		Geometria geo = new Geometria();
		int resultado = geo.arearombo(5, 5);
		double esperado = 12.5;
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}


	@Test
	public void testAreaRomboide() {
		Geometria geo = new Geometria();
		int resultado = geo.arearomboide(5, 5);
		double esperado = 25;
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}
	
	@Test
	public void testAreaTrapecio() {
		Geometria geo = new Geometria();
		int resultado = geo.areatrapecio(5, 5, 5);
		double esperado = 25;
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}
	
	@Test
	public void testFigura() {
		//Test1
		Geometria geo = new Geometria();
		String resultado = geo.figura(2);
		String esperado = "Circulo";
		assertEquals(esperado, resultado);// devuleve si es correcto o no
		//Test2
		resultado = geo.figura(1341);
		esperado = "Default";
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}

}
