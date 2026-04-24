package engsoft.jogo.patos;

public class Coelho_Pequeno extends Coelho{

    public Coelho_Pequeno() {
        setComportamentoPulo(new Pulo_Certinho());
    }

    String mostrar() {
        return "Sou o coelho pequeno";
    }

}
