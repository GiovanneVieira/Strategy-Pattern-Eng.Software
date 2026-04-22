package engsoft.jogo.patos;

public interface Padrao_Pulaveis extends ComportamentoPato {
    @Override
    default String executarComportamento(){
        return Pular();
    };
    String Pular();
}
