package ar.edu.unlam.tallerweb.figuras;

public class Cuadrado {
	Double lado;
	
	public Cuadrado(Double lado){
		this.lado=lado;
	}
	public Double calcularArea(){
		return this.lado*this.lado;
	}
	public Double calcularPerimetro(){
		return this.lado*4;
	}
}
