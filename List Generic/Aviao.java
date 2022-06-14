
public class Aviao extends Automovel{
	private String turbina;
	private String modelo;

	public Aviao(String cor, String motor, int qtdAssent, String turbina, String modelo) {
		super(cor, motor, qtdAssent);
		setTurbina(turbina);
		setModelo(modelo);
	}
	
	public String getTurbina() {
		return turbina;
	}

	public void setTurbina(String turbina) {
		this.turbina = turbina;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
