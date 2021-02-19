
public class BuscaMenorSalario {

	public static void main(String[] args) {
		
	Pessoa pessoas[] = {
		
	 new Pessoa (" Joao", 5000),
	 new Pessoa (" Carlos", 12000),
	 new Pessoa (" Chico", 1000),
	 new Pessoa (" Neuza", 12000),
	 new Pessoa (" Bruno", 2000)
	};
	 
		
		int menorSalario = buscaMenorSalario(pessoas, 0,4);
		
	
		System.out.println(menorSalario);
		System.out.println("A pessoa" + pessoas [menorSalario].getNome()
				+ " é quem tem o menor salario " + 
				"e o seu sálario é "+ pessoas[menorSalario].getSalario());
		

	}

	private static int buscaMenorSalario(Pessoa[] pessoas, int inicio, int termino) {
		
		int menorSalario = inicio;
		
	
		for (int atual =inicio; atual <= termino; atual++) {
			if (pessoas[atual].getSalario() < pessoas[menorSalario].getSalario())
				menorSalario = atual;
		}
		return menorSalario;
	}

}
