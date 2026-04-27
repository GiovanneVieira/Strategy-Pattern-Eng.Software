package engsoft.jogo.patos;

public class Main {

	public static void main(String[] args) {
		Pato pt = new Pato_Ruivo();		
		System.out.println(pt.nadar());
        System.out.println(pt.comportamento_pato());

        System.out.println(pt.mostrar());
        pt.setComportamentoVoavel(new Voar_Foguete());

		System.out.println(pt.comportamento_pato());

		pt.setComportamentoVoavel(new Voar_Raso());
 	    System.out.println(pt.comportamento_pato());

        Pato ptLouco = new Pato_Louco();
        System.out.println(ptLouco.mostrar());
        System.out.println(ptLouco.comportamento_pato());

        Pato ptAtleta = new Pato_Atleta();
        System.out.println(ptAtleta.mostrar());
        System.out.println(ptAtleta.comportamento_pato());

        ptAtleta.setComportamentoPulavel(new Pulo_Desordenado());
        System.out.println(ptAtleta.comportamento_pato());

        System.out.println();
        System.out.println("===== PARTE C - COELHOS =====");

        Coelho cb = new Coelho_Branco();
        System.out.println(cb.mostrar());
        System.out.println(cb.pular());

        Coelho cc = new Coelho_Cansado();
        System.out.println(cc.mostrar());
        System.out.println(cc.pular());

        System.out.println();
        System.out.println("--- O coelho cansado descansou... ---");
        cc.setComportamentoPular(new Pulo_Alto());
        System.out.println(cc.pular());

	}

}
