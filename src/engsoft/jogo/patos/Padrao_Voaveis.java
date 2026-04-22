package engsoft.jogo.patos;

//A interface pode também considerada uma classe abstrata
//Pois ela não deve implementar nada em si, e não pode ser instanciada
//Toda classe que implementar a interface deve implementar todos os métodos.


public interface Padrao_Voaveis extends ComportamentoPato {
    @Override
    default String executarComportamento(){
        return voar();
    }
    String voar();
	
	double getVelocidade();
}
