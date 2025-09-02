package ar.edu.unlam.dominio;

public class Calculadora {

	public Integer getSumar(int i, int j) {
		
		return i + j;
	}

	public Integer getRestar(int i, int j) {
		
		return i - j;
	}

	public Integer getMultiplicar(int i, int j) {
		
		return i * j;
	}

	public Integer getDividir(int i, int j) {
		if(j == 0) {
			return 0;
		}
		return i / j;
	}

}
