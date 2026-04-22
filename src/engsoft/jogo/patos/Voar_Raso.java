package engsoft.jogo.patos;

//Programação voltada a interface
//Utiliza-se da interface com um contrato, evitando assim depender de uma classe concreta
//No contexto a seguir foi criado uma interface "Padrao_Voaveis" para definir todos os metodos que
//Diferentes tipos de Voo devem conter, porém cada tipo de Voo tem sua propria implementação dos respecticos
//Metodos, garantindo flexibilidade.

public class Voar_Raso implements Padrao_Voaveis {
	
	private double velocidade;
	
	public Voar_Raso() {
		velocidade = 100;
	}

	@Override
	public String voar() {
		return "Voando perto do ch�o. Velocidade: "
				+ getVelocidade();
	}

	@Override
	public double getVelocidade() {
		return velocidade;
	}

}
