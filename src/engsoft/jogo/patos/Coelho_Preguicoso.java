package engsoft.jogo.patos;

public class Coelho_Preguicoso extends Coelho{

    public Coelho_Preguicoso(){
        setComportamento_coelho_pulo(new Pulo_Desordenado());
        setComportamento_coelho_cavar(new Cavar_Pouco());
    }

    @Override
    String mostrar(){return "Sou um Coelho Muito Preguicoso";}

}
