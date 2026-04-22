package engsoft.jogo.patos;

public class Main {

	public static void main(String[] args) {
		Pato pt = new Pato_Ruivo();		
		Pato ptAtleta = new Pato_Atleta();
//		System.out.println(pt.nadar());
//        System.out.println(pt.comportamento_pato());
//
//        System.out.println(pt.mostrar());
//        pt.setComportamentoVoavel(new Voar_Foguete());
//
//		System.out.println(pt.comportamento_pato());
//
//		pt.setComportamentoVoavel(new Voar_Raso());
//
//		System.out.println(pt.comportamento_pato());
        System.out.println(ptAtleta.mostrar());
        System.out.println(ptAtleta.comportamento_pato());
        ptAtleta.setComportamentoPulavel(new Pulo_Desordenado());
        System.out.println(ptAtleta.comportamento_pato());

	}

}
