package ejemplo1;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora miCalculadora = new Calculadora();
		int suma = miCalculadora.suma(2, 2);
		assertEquals(4, suma);

	}

	@Test
	void testRestar() {
		Calculadora miCalculadora = new Calculadora();

		assertTrue(miCalculadora.restar(0, 5) < 0);
	}

	@Test
	void testDividirEteron() {
		Calculadora miCalculadora = new Calculadora();

		assertThrows(ArithmeticException.class, () -> miCalculadora.dividirEteron(2, 0));
	}

	@Test
	void testDividirDecimal() {
		Calculadora miCalculadora = new Calculadora();

		assertEquals(3.33, miCalculadora.dividirDecimal(10, 3), 0.01);

	}

	@ParameterizedTest
	@ValueSource(ints = { 3, 4, 2, 0, Integer.MAX_VALUE })

	void testRaizCuadrada(int valor) {
		Calculadora miCalculadora = new Calculadora();
		assumeTrue(valor > 1);
		assertTrue(miCalculadora.raizCuadrada(valor) > 0);

	}

}
