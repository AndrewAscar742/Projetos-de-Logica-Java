import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		long num = 0;
		String confirm = "";
		
		
		do {
			try {
				num = 0;
				
				String cpf = JOptionPane.showInputDialog("Digite o seu CPF");
				num = Cpf.validarCPF(cpf);
				
				if (num == 0) {
					JOptionPane.showMessageDialog(null, "Seu CPF é válido");
					
				}else{
					JOptionPane.showMessageDialog(null, "Seu CPF é Inválido");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				  confirm = String.valueOf(JOptionPane.showConfirmDialog(null, "Deseja continuar?")); 
			}
		} while (confirm.equals("0"));
		
	}

}
