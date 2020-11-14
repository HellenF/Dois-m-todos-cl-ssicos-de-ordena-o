package vetor;

public class Cliente {
	
	private String nome;
	
	public Cliente (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
		
	}
	
	//fazer comparações
	
	
	@Override
	public boolean equals(Object obj) {
		Cliente outro = (Cliente) obj;
		return outro.getNome().equals(this.nome);
	}
	
	@Override
	public String toString() {
		return this.nome;
	}

}
