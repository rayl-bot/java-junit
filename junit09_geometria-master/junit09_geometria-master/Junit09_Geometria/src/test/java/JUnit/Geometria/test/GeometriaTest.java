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
		double esperado = 3.1416 * Math.pow(5, 2);
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}

	@Test
	public void testAreaTriangulo() {// en este ejercicio no pasa el test
		Geometria geo = new Geometria();
		int resultado = geo.areatriangulo(5, 5);
		int esperado = 12;
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
		int esperado = 12;
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}

	@Test
	public void testAreaRombo() {
		Geometria geo = new Geometria();
		int resultado = geo.arearombo(5, 5);
		double esperado = 12;
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
		// Test1
		Geometria geo = new Geometria(1);
		String resultado = geo.figura(2);
		String esperado = "Circulo";
		assertEquals(esperado, resultado);// devuleve si es correcto o no
		// Test2
		resultado = geo.figura(1341);
		esperado = "Default";
		assertEquals(esperado, resultado);// devuleve si es correcto o no
		// Resto de test
		resultado = geo.figura(3);
		esperado = "Triangulo";
		assertEquals(esperado, resultado);// devuleve si es correcto o no

		resultado = geo.figura(4);
		esperado = "Rectangulo";
		assertEquals(esperado, resultado);// devuleve si es correcto o no

		resultado = geo.figura(5);
		esperado = "Pentagono";
		assertEquals(esperado, resultado);// devuleve si es correcto o no

		resultado = geo.figura(6);
		esperado = "Rombo";
		assertEquals(esperado, resultado);// devuleve si es correcto o no

		resultado = geo.figura(7);
		esperado = "Romboide";
		assertEquals(esperado, resultado);// devuleve si es correcto o no

		resultado = geo.figura(8);
		esperado = "Trapecio";
		assertEquals(esperado, resultado);// devuleve si es correcto o no
	}

	@Test
	public void testGetSet() {
		Geometria geo = new Geometria(1);
		geo.setArea(3);
		geo.setId(2);
		geo.setNom("ejemplo");
		assertEquals(2, geo.getId());// devuleve si es correcto o no
		assertEquals(3, geo.getArea());// devuleve si es correcto o no
		assertEquals("ejemplo", geo.getNom());// devuleve si es correcto o no

	}

	@Test
	public void testString() {
		Geometria geo = new Geometria(1);
		String cosa = "Geometria [id=" + geo.getId() + ", nom=" + geo.getNom() + ", area=" + geo.getArea() + "]";
		assertEquals(cosa, geo.toString());// devuleve si es correcto o no
	}

}
