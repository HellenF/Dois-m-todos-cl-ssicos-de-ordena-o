package vetor;

public class VetorTest {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente ("Joao");
		Cliente c2 = new Cliente ("Maria");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(c1);
		System.out.println(lista.tamanho());
		
		lista.adiciona(c2);
		System.out.println(lista.tamanho());
		
		System.out.println(lista);
		
		Cliente c3 = new Cliente ("Danilo");
		
		System.out.println(lista.contem(c1));
		
		System.out.println(lista.pega(2));
	}
	

}
