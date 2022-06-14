
public class Motocicleta extends Automovel{
	private String categoriaMoto;

	public Motocicleta(String cor, String motor, int qtdAssent, String categoria) {
		super(cor, motor, qtdAssent);
		setCategoriaMoto(categoria);
	}

	public String getCategoriaMoto() {
		return categoriaMoto;
	}

	public void setCategoriaMoto(String categoriaMoto) {
		this.categoriaMoto = categoriaMoto;
	}
}
