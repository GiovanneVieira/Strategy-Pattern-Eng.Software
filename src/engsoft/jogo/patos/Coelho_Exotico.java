package engsoft.jogo.patos;

public class Coelho_Exotico extends Coelho{

    public Coelho_Exotico(){
        setComportamento_coelho_pulo(new Pulo_Desordenado());
    }

    @Override
    String mostrar(){
        return "Olha eu sou um coelho muito exotico!";
    }

}
