package engsoft.jogo.patos;

public class Coelho_Lixo extends Coelho{

    public Coelho_Lixo(){
        setComportamento_coelho_pulo(new Pulo_Desordenado());
    }

    @Override
    String mostrar(){
        return "Olha eu sou um coelho muito lixo!";
    }

}
