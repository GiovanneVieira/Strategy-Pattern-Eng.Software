package engsoft.jogo.patos;

//Herança sendo aplicada, a herança se baseia em ter uma Super Classe e classes filho.
//As classes que são derivadas da Super Classes herdarão todos os atributos e métodos da classe pai.
//A notação de extends indica que a herança será utilizada, nesse caso Pato_Borracha é uma classe filho de Pato
public class Pato_Borracha extends Pato {

	public Pato_Borracha() {
		setComportamentoVoavel(new Nao_Voa());
	}

    //Aqui vemos o Polimorfismo, que como conceito permite que objetos de diferentes subclasses atuem de
    // diferentes formas atuem de diferentes formas em um mesmo METODO
    //Aqui o conceito está presente por conta de objeto estar presente nas 3 subclasses e não na classe pai, tendo três
    //implementações distintas
    //Caso o "mostrar" tivesse sua implementação na classe pai,  todos exibiriam a mesma mensagem.

	public String mostrar() {
		return "Ol�, eu sou de Boarracha.";
	}
	
}
