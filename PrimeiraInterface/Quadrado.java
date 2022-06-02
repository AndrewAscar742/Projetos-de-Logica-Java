
public class Quadrado implements Area {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double area() {
		return lado * lado;
	}
}
