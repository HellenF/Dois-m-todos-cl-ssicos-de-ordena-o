package vetor;

import java.util.Arrays;

public class Vetor {
	
	
	//métodos
	//quando criar um objeto do tipo vetor ele já vai ter o tamnho do vetor de 100
	private Cliente[] clientes = new Cliente[100];
	private int totalDeClientes = 0;
	
	
	
	public void adiciona (Cliente cliente) {
		
	this.clientes [totalDeClientes] = cliente;
	totalDeClientes++;
		
	}	
	
	
	
	//retornar elemento que esta na posição
	public Cliente pega (int pisicao) {
		return null;
		
	}
	
	//remover cliente na pos
	public void remove (int posicao ) {
		
	}
	
	public boolean contem(Cliente cliente) {
		for(int i=0; i< clientes.length; i++) {
			if (cliente.equals(clientes[i])) {
				return true;
				
			}
		}
		return false;
	}
	// tamanho da lista
	public int tamanho() {
		return 0;
	}
	public String toString() {
		return Arrays.toString(clientes);
	}
	
	
	

}
