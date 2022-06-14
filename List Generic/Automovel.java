
public class Automovel {
	private String cor;
	private String motor;
	private int qtdAssent;
	
	public Automovel(String cor, String motor, int qtdAssent) {
		setCor(cor);
		setMotor(motor);
		setQtdAssent(qtdAssent);
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getQtdAssent() {
		return qtdAssent;
	}
	public void setQtdAssent(int qtdAssent) {
		this.qtdAssent = qtdAssent;
	}
}
