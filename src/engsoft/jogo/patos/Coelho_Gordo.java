package engsoft.jogo.patos;

public class Coelho_Gordo extends Coelho{

    public Coelho_Gordo() {
        setComportamentoPulo(new Pulo_Desordenado());
    }

    @Override
    String mostrar() {
        return "Sou o coelho gordo";
    }
}
