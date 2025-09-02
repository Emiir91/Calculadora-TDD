package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculadora {
	
	private Calculadora kasio;
	
	@Before
	public void inicializacion() {
		this.kasio = new Calculadora();
	}
	
	@Test
	public void dadoQueTengoUnaSumaElResultadoDebeDarme10() {
		
		Integer sumaDeLaCalculadoraKasioObtenida = this.kasio.getSumar(7, 3);
		Integer sumaDeLaCalculadoraKasioEsperada = 10;
		
		assertEquals(sumaDeLaCalculadoraKasioEsperada, sumaDeLaCalculadoraKasioObtenida);
	}
	
	@Test
	public void dadoQueTengoUnaRestaElResultadoDebeDarme5() {
		
		Integer restaDeLaCalculadoraKasioObtenida = this.kasio.getRestar(7, 2);
		Integer restaDeLaCalculadoraKasioEsperada = 5;
		
		assertEquals(restaDeLaCalculadoraKasioEsperada, restaDeLaCalculadoraKasioObtenida);
	}
	
	@Test
	public void dadoQueTengoUnaMultiplicacionElResultadoDebeDarme12() {
		
		Integer multiplicacionDeLaCalculadoraKasioObtenida = this.kasio.getMultiplicar(6, 2);
		Integer multiplicacionDeLaCalculadoraKasioEsperada = 12;
		
		assertEquals(multiplicacionDeLaCalculadoraKasioEsperada, multiplicacionDeLaCalculadoraKasioObtenida);
	}
	
	@Test
	public void dadoQueTengoUnadivisionElResultadoDebeDarme4() {
		
		Integer divisionDeLaCalculadoraKasioObtenida = this.kasio.getDividir(8, 0);
		Integer divisionDeLaCalculadoraKasioEsperada = 0;
		
		assertEquals(divisionDeLaCalculadoraKasioEsperada, divisionDeLaCalculadoraKasioObtenida);
	}
}
