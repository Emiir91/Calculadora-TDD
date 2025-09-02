package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadora {
	
	@Test
	public void dadoQueTengoUnaSumaElResultadoDebeDarme10() {
		Calculadora kasio = new Calculadora();
		
		Integer sumaDeLaCalculadoraKasioObtenida = kasio.getSumar(7, 3);
		Integer sumaDeLaCalculadoraKasioEsperada = 10;
		
		assertEquals(sumaDeLaCalculadoraKasioEsperada, sumaDeLaCalculadoraKasioObtenida);
	}
	
	@Test
	public void dadoQueTengoUnaRestaElResultadoDebeDarme5() {
		Calculadora kasio = new Calculadora();
		
		Integer restaDeLaCalculadoraKasioObtenida = kasio.getRestar(7, 2);
		Integer restaDeLaCalculadoraKasioEsperada = 5;
		
		assertEquals(restaDeLaCalculadoraKasioEsperada, restaDeLaCalculadoraKasioObtenida);
	}
	
	@Test
	public void dadoQueTengoUnaMultiplicacionElResultadoDebeDarme12() {
		Calculadora kasio = new Calculadora();
		
		Integer multiplicacionDeLaCalculadoraKasioObtenida = kasio.getMultiplicar(6, 2);
		Integer multiplicacionDeLaCalculadoraKasioEsperada = 12;
		
		assertEquals(multiplicacionDeLaCalculadoraKasioEsperada, multiplicacionDeLaCalculadoraKasioObtenida);
	}
	
	@Test
	public void dadoQueTengoUnadivisionElResultadoDebeDarme4() {
		Calculadora kasio = new Calculadora();
		
		Integer divisionDeLaCalculadoraKasioObtenida = kasio.getDividir(8, 0);
		Integer divisionDeLaCalculadoraKasioEsperada = 0;
		
		assertEquals(divisionDeLaCalculadoraKasioEsperada, divisionDeLaCalculadoraKasioObtenida);
	}
}
