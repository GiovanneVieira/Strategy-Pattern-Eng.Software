package engsoft.jogo.patos;

public class Coelho_Doido extends Coelho{

    public Coelho_Doido(){
        setComportamento_coelho_pulo(new Pulo_Esquerda());
        setComportamento_coelho_cavar(new Cavar_Muito());
        setComportamento_coelho_comer(new Comer_Muito());
    }

    @Override
        String mostrar(){
            return "Olha, eu sou o Coelho Doido!";

    }
}
