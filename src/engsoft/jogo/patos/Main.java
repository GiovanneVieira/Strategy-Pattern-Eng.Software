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

        Coelho cDoido = new Coelho_Doido();
        System.out.println(cDoido.mostrar());
        System.out.println(cDoido.getComportamento_coelho_pulo());
        System.out.println(cDoido.getComportamento_coelho_cavar());

        Coelho cLixo = new Coelho_Lixo();
        System.out.println(cLixo.mostrar());
        System.out.println(cLixo.getComportamento_coelho_pulo());

        Coelho cPreguicoso = new Coelho_Preguicoso();
        System.out.println(cPreguicoso.mostrar());
        System.out.println(cPreguicoso.getComportamento_coelho_pulo());
        System.out.println(cPreguicoso.getComportamento_coelho_cavar());

	}

}
