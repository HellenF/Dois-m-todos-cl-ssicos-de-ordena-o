
public class TestaOrdenacao {

	public static void main(String[] args) {	
		
				
				Pessoa pessoas[] = {				
						 new Pessoa (" Joao", 5000),
						 new Pessoa (" Carlos", 12000),
						 new Pessoa (" Chico", 1000),
						 new Pessoa (" Neuza", 17000),
						 new Pessoa (" Bruno", 2000)
						};
				
				//ordena (pessoas,5 );
				insetionSort(pessoas, pessoas.length );
				
			
				for (Pessoa pessoa :pessoas) {
					System.out.println(pessoa.getNome() + " ganha " + pessoa.getSalario());
			
				
				}
		
			}
			
		private static void insetionSort(Pessoa[] pessoas,int quantidadeElementos) {
			
			for (int atual =1; atual < quantidadeElementos; atual ++) {
				
				int analise = atual;
				while (analise > 0 && pessoas[analise].getSalario() < pessoas [analise -1].getSalario()) {
					troca (pessoas, analise, analise - 1);
					
					
					
					analise --;
					
				}
			}
		
		
	}

		private static void troca(Pessoa[] pessoas, int primeiro, int segundo) {
			Pessoa primeiraPessoa = pessoas[primeiro];
			Pessoa segundaPessoa = pessoas [ segundo ];
			System.out.println(" Trocando " + primeiraPessoa.getNome()+ "com " + segundaPessoa.getNome());
			
			
			
			pessoas[primeiro] = segundaPessoa;
			pessoas[segundo] = primeiraPessoa;
			
		}
}
		
		
		
			
			
		
		
					
				
		
		


	


