package engsoft.jogo.patos;

//Aqui observa-se uma classe concreta, pois temos uma classe que implementa todos os
//seus metodos, sendo contrária a Abstrata.
//Ainda citando sua particularidade com a Abstrata, a Concreta pode ser instanciada.
public class Pato_Ruivo extends Pato implements Padrao_Grasnar{

	public Pato_Ruivo()
	{
		setComportamentoVoavel(new Voaveis_Asa());
	}
	
	public String mostrar() {
		return "Eu sou o Pato Ruivo." ;
	}

	public String grasnar() {
		// TODO Auto-generated method stub
		return 	"Que-Que.";
	
	}

}
