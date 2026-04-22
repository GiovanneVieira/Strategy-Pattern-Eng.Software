package engsoft.jogo.patos;


//Classe Abstrata Pato, uma classe abstrata é uma classe que não pode ser instanciada e contém
//pelo menos um método abstrado. Nesse caso o método mostrar() que no contexto deve ser diferente para cada tipo de pato

public abstract class Pato {
	
	protected Padrao_Voaveis comportamento_pato_voavel;
    protected Padrao_Pulaveis comportamento_pato_pulavel;
//Aqui vemos um exemplo de método abstrato
//Metodos Abstratos não implementação por parte de sua classe pai, apenas as sub-classes, que devem implementar
//sua própria lógica
	abstract String mostrar();
	
	public String nadar()
	{
		return "Pato Nadando.";		
	}	
	
	public void setComportamentoVoavel(Padrao_Voaveis padrao ) {
		comportamento_pato_voavel = padrao;
	}
    public void setComportamentoPulavel(Padrao_Pulaveis padrao )
    {
        comportamento_pato_pulavel = padrao;
    }

//Abaixo é apresentado o conceito de delegação, visto que no metodo abaixo a responsabilidade e execução
// é transferida para o objeto comportamento_pato_voavel
    public String comportamento_pato() {
        if(comportamento_pato_voavel == null) {
            return comportamento_pato_pulavel.Pular();
        }
            return comportamento_pato_voavel.voar();
	}
}
