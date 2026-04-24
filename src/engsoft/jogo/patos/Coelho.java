package engsoft.jogo.patos;

public abstract class Coelho {

    protected Padrao_Pulaveis comportamento_coelho_pulo;

    abstract String mostrar();


    public void setComportamento_coelho_pulo(Padrao_Pulaveis comportamento_coelho_pulo) {
        this.comportamento_coelho_pulo = comportamento_coelho_pulo;
    }

    public String getComportamento_coelho_pulo() {
        return comportamento_coelho_pulo.pular();
    }
}
