package engsoft.jogo.patos;

public abstract class Coelho {

    protected Padrao_Pulaveis comportamento_coelho_pulo;

    protected Padrao_Cavaveis comportamento_coelho_cavar;

    protected Padrao_Comiveis comportamento_coelho_comer;

    abstract String mostrar();


    public void setComportamento_coelho_pulo(Padrao_Pulaveis comportamento_coelho_pulo) {
        this.comportamento_coelho_pulo = comportamento_coelho_pulo;
    }

    public String getComportamento_coelho_pulo() {
        return comportamento_coelho_pulo.pular();
    }

    public void setComportamento_coelho_cavar(Padrao_Cavaveis comportamento_coelho_cavar) {
        this.comportamento_coelho_cavar = comportamento_coelho_cavar;
    }

    public String getComportamento_coelho_cavar() {return comportamento_coelho_cavar.cavar();}

    public void setComportamento_coelho_comer(Padrao_Comiveis comportamento_coelho_comer) {
        this.comportamento_coelho_comer = comportamento_coelho_comer;
    }
    public String getComportamento_coelho_comer() {return comportamento_coelho_comer.comer();}


}
