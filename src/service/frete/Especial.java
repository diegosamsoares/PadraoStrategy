package service.frete;

import service.Frete;
public class Especial implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 2 + 15;
	}
	
}
