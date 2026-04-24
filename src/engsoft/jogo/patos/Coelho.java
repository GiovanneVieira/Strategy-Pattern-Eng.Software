package engsoft.jogo.patos;

public abstract class Coelho {

    protected Padrao_Pulaveis comportamento_coelho;
    abstract String mostrar();

    public void setComportamentoPulo(Padrao_Pulaveis comportamento_coelho) {
        this.comportamento_coelho = comportamento_coelho;
    }

    public String getComportamento(){
        return comportamento_coelho.pular();
    }

}
