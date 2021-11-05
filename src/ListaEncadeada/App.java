package ListaEncadeada;

public class App {

	public static void main(String[] args) {
		
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.adicionaPrimeiroElemento(new No(1));
		lista.adicionaElemento(new No(3));
		lista.adicionaElemento(new No(6));
		lista.adicionaElemento(new No(5));
		lista.adicionaElemento(new No(2));
		lista.adicionaElemento(new No(7));
		lista.adicionaElemento(new No(null));
		System.out.println("===============   1");
		System.out.println(lista.toString());
		
		//lista.inverteLista();
		lista.ordemCrescente();
		
		
//		lista.adicionaPosicao(3, new No("Vanessa"));
//		System.out.println("===============   2");
//		System.out.println(lista.toString());
//		lista.removeCabeca();
//		System.out.println("===============   3");
//		System.out.println(lista.pegaElemento(2).toString());
//		lista.adicionaPrimeiroElemento(new No("Ícaro111111111"));
//		System.out.println("===============  4 ");
//		System.out.println(lista.toString());
	
	}

}
