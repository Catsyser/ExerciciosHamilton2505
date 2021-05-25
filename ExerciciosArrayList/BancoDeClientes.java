import java.util.ArrayList;

public class BancoDeClientes {
	ArrayList<Cliente> clientes;
	
	public BancoDeClientes() {
		clientes = new ArrayList<Cliente>();
	}
	
	public void inserirCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void removerCliente(int i) {
		clientes.remove(i);
	}
	
	public void alterarCliente(int pos, String nome, String fone, int id) {
		clientes.get(pos).setNome(nome);
		clientes.get(pos).setFone(fone);
		clientes.get(pos).setId(id);
	}
	
	public void listarCliente (int id) {
		int i = 0;
		
		for(Cliente cliente : clientes) {
			if(cliente.getId() == id) {
				System.out.println("Cliente [" + i + "] = nome: " + cliente.getNome() + " fone: " + cliente.getFone() + " id: " + cliente.getId());
			}
			i++;
		}
	}
	
	public void listarTodosClientes() {
		int i = 0;
		for(Cliente cliente : clientes) {
			System.out.println("Cliente [" + i + "] = nome: " + cliente.getNome() + " fone: " + cliente.getFone() + " id: " + cliente.getId());
			i++;
		}
	}
}
