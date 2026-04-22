package engsoft.jogo.patos;

//O conceito de composição pode ser demonstrado no trecho "setComportamento(new Voaveis_Asa());"
//O trecho apresenta um comportamento tipico de composição, o objeto utiliza de um oobjeto externo para definir parte
//de seu comportamento

public class Pato_Bravo extends Pato implements  Padrao_Grasnar{

	public Pato_Bravo()	
	{
		setComportamentoVoavel(new Voaveis_Asa());
	}
	
	public String mostrar() {		
		return "Eu sou o Pato Bravo.";
	}

	public String grasnar() {
		return "Que-Que. Grrrrrrrrr.";
	}

}
