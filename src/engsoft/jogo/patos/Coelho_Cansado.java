package engsoft.jogo.patos;

public class Coelho_Cansado extends Coelho {

    public Coelho_Cansado() {
        setComportamentoPular(new Pulo_Fraco());
    }

    @Override
    public String mostrar() {
        return "Eu sou um Coelho Cansado.";
    }
}