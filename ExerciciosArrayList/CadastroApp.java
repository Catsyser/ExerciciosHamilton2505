import javax.swing.JOptionPane;

public class CadastroApp {

	public static void main(String[] args) {
		BancoDeClientes bdc = new BancoDeClientes();
		
		int choice;
		
		do {
			choice = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da ação desejada: \n"
					+ "1- Inserir um cliente;\n"
					+ "2- Listar somente um cliente;\n"
					+ "3- Listar todos os clientes;\n"
					+ "4- Remover um cliente;\n"
					+ "5- Alterar os dados de um cliente;\n"
					+ "0- Sair."));
			switch(choice) {
			case 1:
				String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
				String fone = JOptionPane.showInputDialog("Digite o fone do cliente");
				int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente"));
				
				Cliente cliente = new Cliente(nome, fone, id);
				bdc.inserirCliente(cliente);
				break;
				
			case 2:
				int identify = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente que deseja listar"));
				bdc.listarCliente(identify);
				break;
			
			case 3:
				bdc.listarTodosClientes();
				break;
			
			case 4:
				int position = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do cliente que deseja remover"));
				bdc.removerCliente(position);
				break;
			
			case 5:
				int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do cliente que deseja alterar"));
				String nName = JOptionPane.showInputDialog("Digite o novo nome do cliente");
				String nFone = JOptionPane.showInputDialog("Digite o novo fone do cliente");
				int nId = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo id do cliente"));
				
				bdc.alterarCliente(pos, nName, nFone, nId);
				break;
			
			default:
				if(choice != 0) {
					System.out.println("O número digitado não é válido.");
				}
			}	
		} while(choice != 0);
	}

}
