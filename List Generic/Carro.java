
public class Carro extends Automovel{
	private String chassi;
	
	public Carro(String cor, String motor, int qtdAssent, String chassi) {
		super(cor, motor, qtdAssent);
		setChassi(chassi);
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	

}
