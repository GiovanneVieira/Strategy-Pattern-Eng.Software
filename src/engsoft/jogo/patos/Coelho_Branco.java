package engsoft.jogo.patos;

public class Coelho_Branco extends Coelho {

    public Coelho_Branco() {
        setComportamentoPular(new Pulo_Alto());
    }

    @Override
    public String mostrar() {
        return "Eu sou um Coelho Branco.";
    }
}