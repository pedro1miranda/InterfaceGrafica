package polimorfismo.model;

public class Converter {
	private String valor1;
	private int valor2;
	private double valor3;
	
	public Converter(String valor1, int valor2, double valor3) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}
	
	public String getValor1() {
		return valor1;
	}
	public void setValor(String valor1) {
		this.valor1 = valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	public double getValor3() {
		return valor3;
	}
	public void setValor3(double valor3) {
		this.valor3 = valor3;
	}
	public int conv(int valor2) {
		//(0 °C × 9/5) + 32 = 32 °F
		return (valor2)+32;
	}
	public double conv(double valor3) {
		//para um resultado aproximado, divida o valor de comprimento por 1,609
		return (valor3/1.609);
	}
	public String conv(String valor1) {
		
		return valor1.toUpperCase();
	}
}
