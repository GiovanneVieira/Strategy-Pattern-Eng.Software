package engsoft.jogo.patos;

public class Pato_Louco extends Pato {

    public Pato_Louco() {
        setComportamentoPulavel(new Pulo_Desordenado());
    }

    @Override
    String mostrar() {
        return "Eu sou o pato louco";
    }
}
