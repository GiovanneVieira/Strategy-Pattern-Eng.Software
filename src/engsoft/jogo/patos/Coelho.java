package engsoft.jogo.patos;

public abstract class Coelho {

    protected Padrao_Pulaveis padraoPulaveis;

    abstract String mostrar();

    public void setComportamentoPular(Padrao_Pulaveis padrao) {
        padraoPulaveis = padrao;
    }

    public String pular() {
        return padraoPulaveis.pular();
    }
}